-- --------------------------------------------------------
-- Host:                         127.0.0.1
-- Versión del servidor:         5.7.33 - MySQL Community Server (GPL)
-- SO del servidor:              Win64
-- HeidiSQL Versión:             11.2.0.6213
-- --------------------------------------------------------

/*!40101 SET @OLD_CHARACTER_SET_CLIENT=@@CHARACTER_SET_CLIENT */;
/*!40101 SET NAMES utf8 */;
/*!50503 SET NAMES utf8mb4 */;
/*!40014 SET @OLD_FOREIGN_KEY_CHECKS=@@FOREIGN_KEY_CHECKS, FOREIGN_KEY_CHECKS=0 */;
/*!40101 SET @OLD_SQL_MODE=@@SQL_MODE, SQL_MODE='NO_AUTO_VALUE_ON_ZERO' */;
/*!40111 SET @OLD_SQL_NOTES=@@SQL_NOTES, SQL_NOTES=0 */;


-- Volcando estructura de base de datos para autocompany
CREATE DATABASE IF NOT EXISTS `autocompany` /*!40100 DEFAULT CHARACTER SET latin1 */;
USE `autocompany`;

-- Volcando estructura para tabla autocompany.cat_motor
CREATE TABLE IF NOT EXISTS `cat_motor` (
  `id_motor` int(11) NOT NULL AUTO_INCREMENT,
  `tipo_motor` varchar(10) DEFAULT NULL,
  PRIMARY KEY (`id_motor`)
) ENGINE=InnoDB AUTO_INCREMENT=10 DEFAULT CHARSET=utf8mb4;

-- Volcando datos para la tabla autocompany.cat_motor: ~3 rows (aproximadamente)
/*!40000 ALTER TABLE `cat_motor` DISABLE KEYS */;
INSERT INTO `cat_motor` (`id_motor`, `tipo_motor`) VALUES
	(4, 'diesel'),
	(6, 'gasolina'),
	(7, 'gas'),
	(8, 'electrico'),
	(9, 'furulas');
/*!40000 ALTER TABLE `cat_motor` ENABLE KEYS */;

-- Volcando estructura para tabla autocompany.cat_tipo_vehi
CREATE TABLE IF NOT EXISTS `cat_tipo_vehi` (
  `id_tipo_vehi` int(11) NOT NULL AUTO_INCREMENT,
  `tipo_vehiculo` varchar(10) DEFAULT NULL,
  PRIMARY KEY (`id_tipo_vehi`)
) ENGINE=InnoDB AUTO_INCREMENT=8 DEFAULT CHARSET=utf8mb4;

-- Volcando datos para la tabla autocompany.cat_tipo_vehi: ~7 rows (aproximadamente)
/*!40000 ALTER TABLE `cat_tipo_vehi` DISABLE KEYS */;
INSERT INTO `cat_tipo_vehi` (`id_tipo_vehi`, `tipo_vehiculo`) VALUES
	(1, 'sedan'),
	(2, 'SUV'),
	(3, 'Hatchback'),
	(4, 'Descapotab'),
	(5, 'Todoterren'),
	(6, 'Pick-up'),
	(7, 'Cupé');
/*!40000 ALTER TABLE `cat_tipo_vehi` ENABLE KEYS */;

-- Volcando estructura para tabla autocompany.loguin
CREATE TABLE IF NOT EXISTS `loguin` (
  `id_loguin` int(11) NOT NULL AUTO_INCREMENT,
  `usuario` varchar(8) DEFAULT NULL,
  `clave` varchar(8) DEFAULT NULL,
  PRIMARY KEY (`id_loguin`),
  KEY `id_loguin` (`id_loguin`)
) ENGINE=InnoDB AUTO_INCREMENT=9 DEFAULT CHARSET=utf8mb4;

-- Volcando datos para la tabla autocompany.loguin: ~3 rows (aproximadamente)
/*!40000 ALTER TABLE `loguin` DISABLE KEYS */;
INSERT INTO `loguin` (`id_loguin`, `usuario`, `clave`) VALUES
	(1, 'admin', 'abc123'),
	(2, 'sergio', 'ser123'),
	(3, 'alex', '12345'),
	(8, 'karta', '123');
/*!40000 ALTER TABLE `loguin` ENABLE KEYS */;

-- Volcando estructura para tabla autocompany.marca
CREATE TABLE IF NOT EXISTS `marca` (
  `id_marca` int(11) NOT NULL AUTO_INCREMENT,
  `nombre_marca` varchar(10) DEFAULT NULL,
  PRIMARY KEY (`id_marca`)
) ENGINE=InnoDB AUTO_INCREMENT=6 DEFAULT CHARSET=utf8mb4;

-- Volcando datos para la tabla autocompany.marca: ~5 rows (aproximadamente)
/*!40000 ALTER TABLE `marca` DISABLE KEYS */;
INSERT INTO `marca` (`id_marca`, `nombre_marca`) VALUES
	(1, 'BMW'),
	(2, 'KIA'),
	(3, 'HYUNDAI'),
	(4, 'TOYOTA'),
	(5, 'NISSAN');
/*!40000 ALTER TABLE `marca` ENABLE KEYS */;

-- Volcando estructura para tabla autocompany.reg_usuario
CREATE TABLE IF NOT EXISTS `reg_usuario` (
  `id_loguin` int(11) DEFAULT NULL,
  `id_rol` int(11) DEFAULT NULL,
  `nombres` varchar(140) DEFAULT NULL,
  `alias_empleado` varchar(8) DEFAULT NULL,
  `area` int(11) DEFAULT NULL,
  KEY `id_rol` (`id_rol`),
  KEY `id_loguin` (`id_loguin`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4;

-- Volcando datos para la tabla autocompany.reg_usuario: ~3 rows (aproximadamente)
/*!40000 ALTER TABLE `reg_usuario` DISABLE KEYS */;
INSERT INTO `reg_usuario` (`id_loguin`, `id_rol`, `nombres`, `alias_empleado`, `area`) VALUES
	(1, 2, 'admin', 'admin', 1),
	(2, 1, 'Sergio', 'sergio', 1),
	(3, 2, 'Alexander', 'alex', 1),
	(8, 2, 'karta', 'karta', 1);
/*!40000 ALTER TABLE `reg_usuario` ENABLE KEYS */;

-- Volcando estructura para tabla autocompany.roles
CREATE TABLE IF NOT EXISTS `roles` (
  `id_rol` int(11) NOT NULL DEFAULT '0',
  `tipo_rol` varchar(50) DEFAULT NULL,
  PRIMARY KEY (`id_rol`)
) ENGINE=InnoDB DEFAULT CHARSET=latin1;

-- Volcando datos para la tabla autocompany.roles: ~2 rows (aproximadamente)
/*!40000 ALTER TABLE `roles` DISABLE KEYS */;
INSERT INTO `roles` (`id_rol`, `tipo_rol`) VALUES
	(1, 'Administrador'),
	(2, 'Empleado');
/*!40000 ALTER TABLE `roles` ENABLE KEYS */;

-- Volcando estructura para tabla autocompany.vehiculo
CREATE TABLE IF NOT EXISTS `vehiculo` (
  `id_vehiculo` int(11) NOT NULL AUTO_INCREMENT,
  `id_tipo_vehi` int(11) DEFAULT NULL,
  `id_motor` int(11) DEFAULT NULL,
  `id_marca` int(11) DEFAULT NULL,
  `transmision` int(11) DEFAULT NULL,
  `modelo` varchar(15) DEFAULT NULL,
  `precio` float DEFAULT NULL,
  `año` varchar(8) DEFAULT NULL,
  PRIMARY KEY (`id_vehiculo`),
  KEY `id_tipo_vehi` (`id_tipo_vehi`),
  KEY `id_motor` (`id_motor`),
  KEY `id_marca` (`id_marca`)
) ENGINE=InnoDB AUTO_INCREMENT=10 DEFAULT CHARSET=utf8mb4;

-- Volcando datos para la tabla autocompany.vehiculo: ~9 rows (aproximadamente)
/*!40000 ALTER TABLE `vehiculo` DISABLE KEYS */;
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
/*!40000 ALTER TABLE `vehiculo` ENABLE KEYS */;

/*!40101 SET SQL_MODE=IFNULL(@OLD_SQL_MODE, '') */;
/*!40014 SET FOREIGN_KEY_CHECKS=IFNULL(@OLD_FOREIGN_KEY_CHECKS, 1) */;
/*!40101 SET CHARACTER_SET_CLIENT=@OLD_CHARACTER_SET_CLIENT */;
/*!40111 SET SQL_NOTES=IFNULL(@OLD_SQL_NOTES, 1) */;
