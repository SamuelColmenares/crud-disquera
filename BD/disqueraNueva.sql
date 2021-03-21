-- --------------------------------------------------------
-- Host:                         127.0.0.1
-- Versión del servidor:         10.4.14-MariaDB - mariadb.org binary distribution
-- SO del servidor:              Win64
-- HeidiSQL Versión:             11.0.0.5919
-- --------------------------------------------------------

/*!40101 SET @OLD_CHARACTER_SET_CLIENT=@@CHARACTER_SET_CLIENT */;
/*!40101 SET NAMES utf8 */;
/*!50503 SET NAMES utf8mb4 */;
/*!40014 SET @OLD_FOREIGN_KEY_CHECKS=@@FOREIGN_KEY_CHECKS, FOREIGN_KEY_CHECKS=0 */;
/*!40101 SET @OLD_SQL_MODE=@@SQL_MODE, SQL_MODE='NO_AUTO_VALUE_ON_ZERO' */;


-- Volcando estructura de base de datos para disquera
CREATE DATABASE IF NOT EXISTS `disquera` /*!40100 DEFAULT CHARACTER SET utf8 */;
USE `disquera`;

-- Volcando estructura para tabla disquera.artista
CREATE TABLE IF NOT EXISTS `artista` (
  `idArtista` int(11) NOT NULL AUTO_INCREMENT,
  `nom_artista` varchar(45) CHARACTER SET utf8mb4 NOT NULL,
  `identificacion` varchar(45) CHARACTER SET utf8mb4 NOT NULL,
  PRIMARY KEY (`idArtista`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8;

-- Volcando datos para la tabla disquera.artista: ~11 rows (aproximadamente)
DELETE FROM `artista`;
/*!40000 ALTER TABLE `artista` DISABLE KEYS */;
INSERT INTO `artista` (`idArtista`, `nom_artista`, `identificacion`) VALUES
	(1, 'El Charrito Negro', '676453'),
	(2, 'Arelis Henao', '523456870'),
	(3, 'Jonny Rivera', '78654354'),
	(4, 'Pipe Bueno', '90876543'),
	(5, 'Alci Acosta', '4541255'),
	(6, 'Joe Arroyo', '554634'),
	(7, 'Dario Gomez', '35224511'),
	(8, 'Yeison Jimenez', '79656354'),
	(9, 'Jhon Alex Castaño', '98754121'),
	(10, 'Jessi Uribeo', '95754652'),
	(11, 'Pola Jara', '98754121');
/*!40000 ALTER TABLE `artista` ENABLE KEYS */;

-- Volcando estructura para tabla disquera.cliente
CREATE TABLE IF NOT EXISTS `cliente` (
  `idCliente` int(11) NOT NULL AUTO_INCREMENT,
  `Nom_clien` varchar(45) CHARACTER SET utf8mb4 NOT NULL,
  `identificacion` varchar(45) CHARACTER SET utf8mb4 NOT NULL,
  `telefono_cel` varchar(15) NOT NULL,
  `telefono_fijo` varchar(15) DEFAULT NULL,
  `ciudad` varchar(45) CHARACTER SET utf8mb4 NOT NULL,
  `direccion_residen` varchar(45) CHARACTER SET utf8mb4 NOT NULL,
  `correo` varchar(45) CHARACTER SET utf8mb4 NOT NULL,
  PRIMARY KEY (`idCliente`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8;

-- Volcando datos para la tabla disquera.cliente: ~4 rows (aproximadamente)
DELETE FROM `cliente`;
/*!40000 ALTER TABLE `cliente` DISABLE KEYS */;
INSERT INTO `cliente` (`idCliente`, `Nom_clien`, `identificacion`, `telefono_cel`, `telefono_fijo`, `ciudad`, `direccion_residen`, `correo`) VALUES
	(1, 'Juan Lopez', '1015997480', '3125478561', '5456327', 'Bogota', 'Cra. 100 # 12-03', 'juan.lopez@yahoo.es'),
	(2, 'Camilo Zuluaga', '79853540', '3105578961', '8054987', 'Bogota', 'Cll. 106 # 7-09', 'camilin@gmail.com'),
	(3, 'Sandra Juliana Peña', '1019997499', '3145558551', 'N/A', 'Bogota', 'Cra. 24 # 112-23', 'sjulianap@yahoo.es'),
	(4, 'Yeimy Tatiana Roa', '1019587413', '3159926551', 'N/A', 'Bogota', 'Cll. 127 # 12-65', 'ytroa@hotmail.es');
/*!40000 ALTER TABLE `cliente` ENABLE KEYS */;

-- Volcando estructura para tabla disquera.pedido
CREATE TABLE IF NOT EXISTS `pedido` (
  `idPedido` int(4) NOT NULL AUTO_INCREMENT,
  `cantidad` int(4) NOT NULL,
  `valor` int(4) NOT NULL,
  `IdProducto` int(4) NOT NULL,
  `Id_Vendedor` int(4) NOT NULL,
  `Id_CLIENTE` int(4) NOT NULL,
  PRIMARY KEY (`idPedido`),
  KEY `fk_Id_Producto` (`IdProducto`),
  KEY `fk_Id_Vendedor` (`Id_Vendedor`),
  KEY `fk_Id_CLIENTE` (`Id_CLIENTE`),
  CONSTRAINT `fk_Id_CLIENTE` FOREIGN KEY (`Id_CLIENTE`) REFERENCES `cliente` (`idCliente`),
  CONSTRAINT `fk_Id_Producto` FOREIGN KEY (`IdProducto`) REFERENCES `producto` (`idproducto`),
  CONSTRAINT `fk_Id_Vendedor` FOREIGN KEY (`Id_Vendedor`) REFERENCES `vendedor` (`idVendedor`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4;

-- Volcando datos para la tabla disquera.pedido: ~4 rows (aproximadamente)
DELETE FROM `pedido`;
/*!40000 ALTER TABLE `pedido` DISABLE KEYS */;
INSERT INTO `pedido` (`idPedido`, `cantidad`, `valor`, `IdProducto`, `Id_Vendedor`, `Id_CLIENTE`) VALUES
	(1, 2, 56327, 6, 3, 2),
	(2, 3, 56327, 5, 2, 1),
	(3, 2, 56327, 4, 3, 2),
	(4, 1, 56327, 3, 1, 3);
/*!40000 ALTER TABLE `pedido` ENABLE KEYS */;

-- Volcando estructura para tabla disquera.producto
CREATE TABLE IF NOT EXISTS `producto` (
  `idProducto` int(4) NOT NULL AUTO_INCREMENT,
  `idArtista` int(4) NOT NULL,
  `idProductor` int(4) NOT NULL,
  `valor_produc` int(9) NOT NULL,
  PRIMARY KEY (`idProducto`),
  KEY `idArtista` (`idArtista`),
  KEY `idProductor` (`idProductor`),
  CONSTRAINT `producto_ibfk_1` FOREIGN KEY (`idArtista`) REFERENCES `artista` (`idArtista`) ON DELETE CASCADE ON UPDATE CASCADE,
  CONSTRAINT `producto_ibfk_2` FOREIGN KEY (`idProductor`) REFERENCES `productor` (`idProductor`) ON DELETE CASCADE ON UPDATE CASCADE
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4;

-- Volcando datos para la tabla disquera.producto: ~8 rows (aproximadamente)
DELETE FROM `producto`;
/*!40000 ALTER TABLE `producto` DISABLE KEYS */;
INSERT INTO `producto` (`idProducto`, `idArtista`, `idProductor`, `valor_produc`) VALUES
	(1, 2, 3, 56327),
	(2, 2, 4, 56327),
	(3, 1, 5, 56327),
	(4, 3, 7, 56327),
	(5, 2, 3, 56327),
	(6, 2, 4, 56327),
	(7, 1, 5, 56327),
	(8, 3, 7, 56327);
/*!40000 ALTER TABLE `producto` ENABLE KEYS */;

-- Volcando estructura para tabla disquera.productor
CREATE TABLE IF NOT EXISTS `productor` (
  `idProductor` int(11) NOT NULL AUTO_INCREMENT,
  `nom_productor` varchar(45) CHARACTER SET utf8mb4 NOT NULL,
  `identificacion` varchar(45) CHARACTER SET utf8mb4 NOT NULL,
  PRIMARY KEY (`idProductor`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8;

-- Volcando datos para la tabla disquera.productor: ~9 rows (aproximadamente)
DELETE FROM `productor`;
/*!40000 ALTER TABLE `productor` DISABLE KEYS */;
INSERT INTO `productor` (`idProductor`, `nom_productor`, `identificacion`) VALUES
	(1, 'Wilfran Castillo Utria', '5462154'),
	(2, 'Jose Miguel de Narvaez', '547824'),
	(3, 'Omar Antonio Geles', '7854623'),
	(4, 'Alci Acosta', '454155'),
	(5, 'Jorge Ivan Calderon', '312457'),
	(6, 'Dario Gomez', '352245'),
	(7, 'Felipe Renan', '79656354'),
	(8, 'Fonseca', '79850454'),
	(9, 'Alberto Tico Mercado', '5746254');
/*!40000 ALTER TABLE `productor` ENABLE KEYS */;

-- Volcando estructura para tabla disquera.vendedor
CREATE TABLE IF NOT EXISTS `vendedor` (
  `idVendedor` int(11) NOT NULL AUTO_INCREMENT,
  `nom_vendedor` varchar(45) CHARACTER SET utf8mb4 NOT NULL,
  `identificacion` varchar(45) CHARACTER SET utf8mb4 NOT NULL,
  PRIMARY KEY (`idVendedor`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8;

-- Volcando datos para la tabla disquera.vendedor: ~3 rows (aproximadamente)
DELETE FROM `vendedor`;
/*!40000 ALTER TABLE `vendedor` DISABLE KEYS */;
INSERT INTO `vendedor` (`idVendedor`, `nom_vendedor`, `identificacion`) VALUES
	(1, 'Mauricio Rojas Sanchez', '1015992568'),
	(2, 'Julian Camilo Ortega', '1014995357'),
	(3, 'Camila Ortiz', '101925746');
/*!40000 ALTER TABLE `vendedor` ENABLE KEYS */;

/*!40101 SET SQL_MODE=IFNULL(@OLD_SQL_MODE, '') */;
/*!40014 SET FOREIGN_KEY_CHECKS=IF(@OLD_FOREIGN_KEY_CHECKS IS NULL, 1, @OLD_FOREIGN_KEY_CHECKS) */;
/*!40101 SET CHARACTER_SET_CLIENT=@OLD_CHARACTER_SET_CLIENT */;
