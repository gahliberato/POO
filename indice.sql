--Criação de tabelas
	 create table Top_10000_IMDb(
     id varchar(1000),
	 title varchar(1000),
	 Rating varchar(1000),
	 Runtime varchar(1000),
	 Genre varchar(1000),
	 Metascore varchar(1000),
	 Plot varchar(1000),
	 Directors varchar(1000),
	 Stars varchar(1000),
	 Votes varchar(1000),
	 Gross varchar(1000),
	 Link varchar(1000)
	 );
	 
     create table Top_10000_TMDb(
	 index varchar(1000),
	 title varchar(1000),
	 original_language varchar(1000),
	 release_date varchar(1000),
	 popularity varchar(1000),
	 vote_average varchar(1000),
	 vote_count varchar(1000),
	 overview varchar(1000)
	 );

--Importação do arquivo .csv desejado para suas respectivas tabelas
COPY Top_10000_IMDb FROM 'C:\Dados\Top_10000_IMDb.csv'  WITH (FORMAT csv, HEADER, DELIMITER ',', ENCODING 'UTF8');
COPY Top_10000_TMDb FROM 'C:\Dados\Top_10000_TMDb.csv'  WITH (FORMAT csv, HEADER, DELIMITER ',', ENCODING 'UTF8');
--Contagem de registros
SELECT COUNT(*) FROM Top_10000_IMDb AS total_movies_IMDb;
SELECT COUNT(*) FROM Top_10000_TMDb AS total_movies_TMDb;

--Testes sem Índices
EXPLAIN ANALYSE
SELECT T1.title AS Título,
T1.Rating AS Avaliação,
T2.title AS Título,
T2.popularity AS Popularidade
FROM Top_10000_IMDb T1
JOIN Top_10000_TMDb T2 ON T1.title = T2.title
ORDER BY T1.Rating DESC;

--Teste com Índices
CREATE INDEX idx_Top_10000_IMDb ON Top_10000_IMDb(title, Rating);
CREATE INDEX idx_Top_10000_TMDb ON Top_10000_TMDb(title, popularity);
EXPLAIN ANALYSE  
SELECT T1.title AS Título,
T1.Rating AS Avaliação,
T2.title AS Título,
T2.popularity AS Popularidade
FROM Top_10000_IMDb T1
JOIN Top_10000_TMDb T2 ON T1.title = T2.title
ORDER BY T1.Rating DESC;
