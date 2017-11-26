# ************************************************************
# Sequel Pro SQL dump
# Version 4541
#
# http://www.sequelpro.com/
# https://github.com/sequelpro/sequelpro
#
# Hôte: localhost (MySQL 5.6.34)
# Base de données: LocationVehicule
# Temps de génération: 2017-11-26 15:41:48 +0000
# ************************************************************


/*!40101 SET @OLD_CHARACTER_SET_CLIENT=@@CHARACTER_SET_CLIENT */;
/*!40101 SET @OLD_CHARACTER_SET_RESULTS=@@CHARACTER_SET_RESULTS */;
/*!40101 SET @OLD_COLLATION_CONNECTION=@@COLLATION_CONNECTION */;
/*!40101 SET NAMES utf8 */;
/*!40014 SET @OLD_FOREIGN_KEY_CHECKS=@@FOREIGN_KEY_CHECKS, FOREIGN_KEY_CHECKS=0 */;
/*!40101 SET @OLD_SQL_MODE=@@SQL_MODE, SQL_MODE='NO_AUTO_VALUE_ON_ZERO' */;
/*!40111 SET @OLD_SQL_NOTES=@@SQL_NOTES, SQL_NOTES=0 */;


# Affichage de la table location
# ------------------------------------------------------------

DROP TABLE IF EXISTS `location`;

CREATE TABLE `location` (
  `id` int(11) unsigned NOT NULL AUTO_INCREMENT,
  `dateDebut` date DEFAULT NULL,
  `dateFin` date DEFAULT NULL,
  `cout_total` int(11) DEFAULT NULL,
  PRIMARY KEY (`id`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8;



# Affichage de la table moto
# ------------------------------------------------------------

DROP TABLE IF EXISTS `moto`;

CREATE TABLE `moto` (
  `id` int(11) unsigned NOT NULL AUTO_INCREMENT,
  `marque` varchar(15) NOT NULL DEFAULT '',
  `modele` varchar(15) NOT NULL DEFAULT '',
  `cout` int(5) NOT NULL,
  `couleur` varchar(10) NOT NULL DEFAULT '',
  `cylindree` varchar(15) NOT NULL DEFAULT '',
  PRIMARY KEY (`id`)
) ENGINE=InnoDB AUTO_INCREMENT=4 DEFAULT CHARSET=utf8;

LOCK TABLES `moto` WRITE;
/*!40000 ALTER TABLE `moto` DISABLE KEYS */;

INSERT INTO `moto` (`id`, `marque`, `modele`, `cout`, `couleur`, `cylindree`)
VALUES
	(1,'Suzuki','test',234,'rouge','657'),
	(2,'Mercedes','C-232',190,'Vert','756'),
	(3,'BMW','F 800',120,'Blanche','798');

/*!40000 ALTER TABLE `moto` ENABLE KEYS */;
UNLOCK TABLES;


# Affichage de la table utilisateur
# ------------------------------------------------------------

DROP TABLE IF EXISTS `utilisateur`;

CREATE TABLE `utilisateur` (
  `id` int(11) unsigned NOT NULL AUTO_INCREMENT,
  `pseudo` varchar(20) NOT NULL DEFAULT '',
  `nom` varchar(20) NOT NULL DEFAULT '',
  `prenom` varchar(20) NOT NULL DEFAULT '',
  `date_naissance` date NOT NULL,
  `sexe` varchar(6) NOT NULL DEFAULT '',
  PRIMARY KEY (`id`)
) ENGINE=InnoDB AUTO_INCREMENT=3 DEFAULT CHARSET=utf8;

LOCK TABLES `utilisateur` WRITE;
/*!40000 ALTER TABLE `utilisateur` DISABLE KEYS */;

INSERT INTO `utilisateur` (`id`, `pseudo`, `nom`, `prenom`, `date_naissance`, `sexe`)
VALUES
	(1,'admin','admin','admin','0000-00-00','H'),
	(2,'jim','rakotoson','jimmy','1994-09-17','H');

/*!40000 ALTER TABLE `utilisateur` ENABLE KEYS */;
UNLOCK TABLES;


# Affichage de la table voiture
# ------------------------------------------------------------

DROP TABLE IF EXISTS `voiture`;

CREATE TABLE `voiture` (
  `id` int(11) unsigned NOT NULL AUTO_INCREMENT,
  `marque` varchar(15) NOT NULL DEFAULT '',
  `modele` varchar(15) NOT NULL DEFAULT '',
  `cout` int(5) NOT NULL,
  `couleur` varchar(10) NOT NULL DEFAULT '',
  `nb_place` int(2) NOT NULL,
  PRIMARY KEY (`id`)
) ENGINE=InnoDB AUTO_INCREMENT=5 DEFAULT CHARSET=utf8;

LOCK TABLES `voiture` WRITE;
/*!40000 ALTER TABLE `voiture` DISABLE KEYS */;

INSERT INTO `voiture` (`id`, `marque`, `modele`, `cout`, `couleur`, `nb_place`)
VALUES
	(1,'Citroen','DS3',231,'Grise',5),
	(2,'Peugeot','308',211,'Anthracite',5),
	(3,'Renault','19',50,'Noir',5);

/*!40000 ALTER TABLE `voiture` ENABLE KEYS */;
UNLOCK TABLES;



/*!40111 SET SQL_NOTES=@OLD_SQL_NOTES */;
/*!40101 SET SQL_MODE=@OLD_SQL_MODE */;
/*!40014 SET FOREIGN_KEY_CHECKS=@OLD_FOREIGN_KEY_CHECKS */;
/*!40101 SET CHARACTER_SET_CLIENT=@OLD_CHARACTER_SET_CLIENT */;
/*!40101 SET CHARACTER_SET_RESULTS=@OLD_CHARACTER_SET_RESULTS */;
/*!40101 SET COLLATION_CONNECTION=@OLD_COLLATION_CONNECTION */;
