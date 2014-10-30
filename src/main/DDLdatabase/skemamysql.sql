CREATE DATABASE UTSp4;

CREATE TABLE IF NOT EXISTS `mahasiswa` (
  `id` int(4) NOT NULL AUTO_INCREMENT,
  `npm` int(10) NOT NULL,
  `nama` varchar(100) NOT NULL,
  `tmplahir` varchar(50) NOT NULL,
  `tgllahir` date NOT NULL,
  `jk` char(1) NOT NULL,
  `alamat` text NOT NULL,
  PRIMARY KEY (`id`)
) ENGINE=InnoDB  DEFAULT CHARSET=latin1 AUTO_INCREMENT=1 ;