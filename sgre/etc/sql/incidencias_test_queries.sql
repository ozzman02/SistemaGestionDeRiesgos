INSERT INTO bd_incidencias.accion_correctiva VALUES (1,'Plan de acción'),(2,'Plan de contingencia');
INSERT INTO bd_incidencias.area VALUES (1,'Proceso'),(2,'Subproceso'),(3,'Producto');
INSERT INTO bd_incidencias.caracter_del_riesgo VALUES (1,'Pérdida ocurrida individual'),(2,'Pérdida ocurrida repetitiva'),(3,'Pérdida estimada contablemente');
INSERT INTO bd_incidencias.categoria_evento_perdida VALUES (1,'Fraude interno'),(2,'Fraude externo'),(3,'Relaciones laborales y seguridad en el puesto de trabajo'),(4,'Clientes, productos y prácticas empresariales'),(5,'Daños a activos materiales'),(6,'Interrupción del negocio y fallos en los sistemas'),(7,'Ejecución entrega y gestión de procesos');
INSERT INTO bd_incidencias.linea_de_negocio VALUES (1,'Finanzas corporativas','Finanzas corporativas'),(2,'Finanzas de administraciones locales y públicas','Finanzas corporativas'),(3,'Banca de inversión','Finanzas corporativas'),(4,'Servicios de asesoramiento','Finanzas corporativas'),(5,'Tesorería por cuentas de terceros','Tesorería'),(6,'Tesorería posiciones propias','Tesorería'),(7,'Tesorería Tradicional','Tesorería'),(8,'Banca de Personas','Banca Minorista'),(9,'Banca Privada','Banca Minorista'),(10,'Banca de desarrollo minorista','Banca Minorista'),(11,'Banca corporativa','Banca Comercial'),(12,'Banca empresarial','Banca Comercial'),(13,'Banca de Desarrollo Comercial','Banca Comercial'),(14,'Banca de Segundo Piso','Banca Comercial'),(15,'Tarjetas de crédito y débito','Tarjetas'),(16,'Administración y Adhesión de comercios','Tarjetas'),(17,'Cobros, pagos y liquidación','Cobros, pagos y liquidación'),(18,'Administración de Fondos de Cesantía','Administración de Activos'),(19,'Administración de peaje bancario y otros','Administración de Activos'),(20,'Administración de fideicomisos','Administración de Activos'),(21,'Administración de Fondos de Pensión','Administración de Activos'),(22,'Custodia','Otros Servicios'),(23,'Comercialización de Seguros autoexpedibles','Otros Servicios'),(24,'Tecnología de la información y comunicación','Otros Servicios'),(25,'Cambios y transformaciones organizacionales','Otros Servicios'),(26,'Otros procesos Transversales a la Organización','Otros Servicios');
INSERT INTO bd_incidencias.riesgo_vinculado VALUES (1,'Crédito'),(2,'Mercado'),(3,'Crédito y Mercado'),(4,'Otros');
INSERT INTO bd_incidencias.riesgo VALUES (1,'SI',NULL,'Descripcion de prueba','Detalle de prueba',NULL,NULL,'2018-03-10',NULL,1,'ALTO',NULL,NULL,NULL,NULL,NULL,'2 Meses',2.00,NULL,NULL,NULL,NULL,'Titulo de prueba',1,1,1,1,1,1,1);

alter table bd_incidencias.riesgo AUTO_INCREMENT = 1;

select * from bd_incidencias.accion_correctiva;
select * from bd_incidencias.area;
select * from bd_incidencias.caracter_del_riesgo;
select * from bd_incidencias.categoria_evento_perdida;
select * from bd_incidencias.linea_de_negocio;
select * from bd_incidencias.responsable;
select * from bd_incidencias.riesgo_vinculado;
select * from bd_incidencias.riesgo;
select * from bd_incidencias.usuario_bdincidencias;

delete from bd_incidencias.riesgo;


