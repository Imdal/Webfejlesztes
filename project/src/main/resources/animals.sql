SET SQL_MODE = "NO_AUTO_VALUE_ON_ZERO";
SET AUTOCOMMIT = 0;
START TRANSACTION;

DROP TABLE IF EXISTS `animals`;
CREATE TABLE  IF NOT EXISTS `animals` (
    `id` int(64) NOT NULL AUTO_INCREMENT,
    `name` varchar(255) DEFAULT NULL,
    `color` varchar(255) DEFAULT NULL,
    PRIMARY KEY (`id`)
) ENGINE=MyISAM AUTO_INCREMENT=4 DEFAULT CHARSET=latin1;


INSERT INTO `animals` (`id`, `name`, `color`, `pattern`) VALUES
(1, 'Bastet', 'silver', 'marble'),
(3, 'BonaDea', 'brown', 'marble');
COMMIT;