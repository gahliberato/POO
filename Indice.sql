	 create table Top_10000_IMDb(
     id varchar(1000),
	 Movie_Name varchar(1000),
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
--
