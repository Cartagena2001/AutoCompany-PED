create database autocompany;
use autocompany;

CREATE TABLE `cat_motor` (
  `id_motor` int(11) NOT NULL,
  `tipo_motor` varchar(10) DEFAULT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4;

INSERT INTO `cat_motor` (`id_motor`, `tipo_motor`) VALUES
(4, 'diesel'),
(6, 'gasolina'),
(7, 'gas');

CREATE TABLE `cat_tipo_vehi` (
  `id_tipo_vehi` int(11) NOT NULL,
  `tipo_vehiculo` varchar(10) DEFAULT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4;

INSERT INTO `cat_tipo_vehi` (`id_tipo_vehi`, `tipo_vehiculo`) VALUES
(1, 'sedan'),
(2, 'SUV'),
(3, 'Hatchback'),
(4, 'Descapotab'),
(5, 'Todoterren'),
(6, 'Pick-up'),
(7, 'Cupé');

CREATE TABLE `loguin` (
  `id_loguin` int(11) NOT NULL,
  `usuario` varchar(8) DEFAULT NULL,
  `clave` varchar(8) DEFAULT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4;

INSERT INTO `loguin` (`id_loguin`, `usuario`, `clave`) VALUES
(1, 'admin', '123'),
(2, 'Caleb', '123'),
(3, 'Guillermo', '12345'),
(4, 'Sergio', '12345'),
(5, 'Jorge', '12345');

CREATE TABLE `marca` (
  `id_marca` int(11) NOT NULL,
  `nombre_marca` varchar(10) DEFAULT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4;

INSERT INTO `marca` (`id_marca`, `nombre_marca`) VALUES
(1, 'BMW'),
(2, 'KIA'),
(3, 'HYUNDAI'),
(4, 'TOYOTA'),
(5, 'NISSAN');


CREATE TABLE `reg_usuario` (
  `id_loguin` int(11) DEFAULT NULL,
  `id_rol` int(11) DEFAULT NULL,
  `nombres` varchar(140) DEFAULT NULL,
  `alias_empleado` varchar(8) DEFAULT NULL,
  `area` int(11) DEFAULT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4;

CREATE TABLE `vehiculo` (
  `id_vehiculo` int(11) NOT NULL,
  `id_tipo_vehi` int(11) DEFAULT NULL,
  `id_motor` int(11) DEFAULT NULL,
  `id_marca` int(11) DEFAULT NULL,
  `transmision` int(11) DEFAULT NULL,
  `modelo` varchar(15) DEFAULT NULL,
  `precio` float DEFAULT NULL,
  `año` varchar(8) DEFAULT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4;

INSERT INTO `vehiculo` (`id_vehiculo`, `id_tipo_vehi`, `id_motor`, `id_marca`, `transmision`, `modelo`, `precio`, `año`) VALUES
(1, 1, 6, 1, 1, '323I', 35, '2000'),
(2, 6, 4, 4, 1, 'Hilux', 15000, '2010'),
(3, 3, 6, 2, 2, 'rio', 5000, '2018'),
(4, 1, 6, 5, 2, 'versa', 7000, '2013'),
(5, 1, 6, 3, 2, 'tiburon', 8000, '2009'),
(6, 6, 4, 4, 1, 'hilux', 3000, '2004'),
(7, 4, 6, 4, 2, 'copue', 6500, '1990'),
(8, 5, 4, 4, 2, 'runner', 11000, '1990'),
(9, 5, 4, 3, 2, 'santa fe', 7000, '2010');

ALTER TABLE `cat_motor`
  ADD PRIMARY KEY (`id_motor`);
  
  ALTER TABLE `cat_tipo_vehi`
  ADD PRIMARY KEY (`id_tipo_vehi`);

ALTER TABLE `loguin`
  ADD PRIMARY KEY (`id_loguin`),
  ADD KEY `id_loguin` (`id_loguin`);
  
  ALTER TABLE `marca`
  ADD PRIMARY KEY (`id_marca`);
  
  ALTER TABLE `reg_usuario`
  ADD KEY `id_rol` (`id_rol`),
  ADD KEY `id_loguin` (`id_loguin`);
  
  ALTER TABLE `vehiculo`
  ADD PRIMARY KEY (`id_vehiculo`),
  ADD KEY `id_tipo_vehi` (`id_tipo_vehi`),
  ADD KEY `id_motor` (`id_motor`),
  ADD KEY `id_marca` (`id_marca`);
  
  ALTER TABLE `cat_motor`
  MODIFY `id_motor` int(11) NOT NULL AUTO_INCREMENT, AUTO_INCREMENT=8;
  
  ALTER TABLE `cat_tipo_vehi`
  MODIFY `id_tipo_vehi` int(11) NOT NULL AUTO_INCREMENT, AUTO_INCREMENT=8;
  
  ALTER TABLE `loguin`
  MODIFY `id_loguin` int(11) NOT NULL AUTO_INCREMENT, AUTO_INCREMENT=4;
  
  ALTER TABLE `marca`
  MODIFY `id_marca` int(11) NOT NULL AUTO_INCREMENT, AUTO_INCREMENT=6;
  
  ALTER TABLE `vehiculo`
  MODIFY `id_vehiculo` int(11) NOT NULL AUTO_INCREMENT, AUTO_INCREMENT=10;
  
  ALTER TABLE `reg_usuario`
  ADD CONSTRAINT `reg_usuario_ibfk_1` FOREIGN KEY (`id_rol`) REFERENCES `roles` (`id_rol`),
  ADD CONSTRAINT `reg_usuario_ibfk_2` FOREIGN KEY (`id_loguin`) REFERENCES `loguin` (`id_loguin`);
  
  ALTER TABLE `vehiculo`
  ADD CONSTRAINT `vehiculo_ibfk_1` FOREIGN KEY (`id_tipo_vehi`) REFERENCES `cat_tipo_vehi` (`id_tipo_vehi`),
  ADD CONSTRAINT `vehiculo_ibfk_2` FOREIGN KEY (`id_motor`) REFERENCES `cat_motor` (`id_motor`),
  ADD CONSTRAINT `vehiculo_ibfk_3` FOREIGN KEY (`id_marca`) REFERENCES `marca` (`id_marca`);

