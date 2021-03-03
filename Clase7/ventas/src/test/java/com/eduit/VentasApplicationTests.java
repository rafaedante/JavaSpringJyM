package com.eduit;

import com.eduit.service.BusquedaClienteFrecuente;
import com.eduit.service.CalculoDescuentos;
import org.junit.jupiter.api.Test;
import org.mockito.Mockito;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.util.Assert;

@SpringBootTest
class VentasApplicationTests {

	@Test
	void contextLoads() {
		Double importeFinal = CalculoDescuentos
				.build()
				.setearidCliente("")
				.setearImporte(1000d)
				.setearBusquedaClienteFrecuente(z->1)
				.calcular();

		Assert.isTrue(importeFinal == 900, "Atencion el importe final no esta bien calculado");
	}

	@Test
	void seLLamoAlservicio() {

		BusquedaClienteFrecuente busquedaCliMock
				= Mockito.mock(BusquedaClienteFrecuente.class);


		CalculoDescuentos
				.build()
				.setearidCliente("ABC")
				.setearImporte(0d)
				.setearBusquedaClienteFrecuente(busquedaCliMock)
				.calcular();

		Mockito.verify(busquedaCliMock,
				Mockito.times(1))
				.descuento("ABC");
	}

}
