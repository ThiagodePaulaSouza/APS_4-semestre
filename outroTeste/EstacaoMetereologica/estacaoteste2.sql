-- phpMyAdmin SQL Dump
-- version 5.1.0
-- https://www.phpmyadmin.net/
--
-- Host: 127.0.0.1
-- Tempo de geração: 05-Out-2021 às 23:09
-- Versão do servidor: 10.4.18-MariaDB
-- versão do PHP: 8.0.3

SET SQL_MODE = "NO_AUTO_VALUE_ON_ZERO";
START TRANSACTION;
SET time_zone = "+00:00";


/*!40101 SET @OLD_CHARACTER_SET_CLIENT=@@CHARACTER_SET_CLIENT */;
/*!40101 SET @OLD_CHARACTER_SET_RESULTS=@@CHARACTER_SET_RESULTS */;
/*!40101 SET @OLD_COLLATION_CONNECTION=@@COLLATION_CONNECTION */;
/*!40101 SET NAMES utf8mb4 */;

--
-- Banco de dados: `estacaoteste2`
--

-- --------------------------------------------------------

--
-- Estrutura da tabela `precipitacao`
--

CREATE TABLE `precipitacao` (
  `cod_precipitacao` int(11) NOT NULL,
  `valor_precipitacao` int(11) DEFAULT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4;

-- --------------------------------------------------------

--
-- Estrutura da tabela `temperatura`
--

CREATE TABLE `temperatura` (
  `cod_temperatura` int(11) NOT NULL,
  `valor_temperatura` int(11) DEFAULT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4;

-- --------------------------------------------------------

--
-- Estrutura da tabela `umidade`
--

CREATE TABLE `umidade` (
  `cod_umidade` int(11) NOT NULL,
  `valor_umidade` double DEFAULT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4;

--
-- Índices para tabelas despejadas
--

--
-- Índices para tabela `precipitacao`
--
ALTER TABLE `precipitacao`
  ADD PRIMARY KEY (`cod_precipitacao`);

--
-- Índices para tabela `temperatura`
--
ALTER TABLE `temperatura`
  ADD PRIMARY KEY (`cod_temperatura`);

--
-- Índices para tabela `umidade`
--
ALTER TABLE `umidade`
  ADD PRIMARY KEY (`cod_umidade`);
COMMIT;

/*!40101 SET CHARACTER_SET_CLIENT=@OLD_CHARACTER_SET_CLIENT */;
/*!40101 SET CHARACTER_SET_RESULTS=@OLD_CHARACTER_SET_RESULTS */;
/*!40101 SET COLLATION_CONNECTION=@OLD_COLLATION_CONNECTION */;
