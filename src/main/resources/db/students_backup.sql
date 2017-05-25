--
-- PostgreSQL database dump
--

-- Dumped from database version 9.6.3
-- Dumped by pg_dump version 9.6.2

-- Started on 2017-05-21 12:05:51 MDT

SET statement_timeout = 0;
SET lock_timeout = 0;
SET idle_in_transaction_session_timeout = 0;
SET client_encoding = 'UTF8';
SET standard_conforming_strings = on;
SET check_function_bodies = false;
SET client_min_messages = warning;
SET row_security = off;

SET search_path = public, pg_catalog;

--
-- TOC entry 185 (class 1259 OID 16384)
-- Name: student_id; Type: SEQUENCE; Schema: public; Owner: asmita
--

CREATE SEQUENCE student_id
    START WITH 6
    INCREMENT BY 1
    NO MINVALUE
    MAXVALUE 999999999999
    CACHE 1;


ALTER TABLE student_id OWNER TO asmita;

SET default_tablespace = '';

SET default_with_oids = false;

--
-- TOC entry 186 (class 1259 OID 16386)
-- Name: students; Type: TABLE; Schema: public; Owner: asmita
--

CREATE TABLE students (
    id bigint DEFAULT nextval('student_id'::regclass) NOT NULL,
    name character varying,
    course character varying
);


ALTER TABLE students OWNER TO asmita;

--
-- TOC entry 2395 (class 0 OID 0)
-- Dependencies: 185
-- Name: student_id; Type: SEQUENCE SET; Schema: public; Owner: asmita
--

SELECT pg_catalog.setval('student_id', 129, true);


--
-- TOC entry 2389 (class 0 OID 16386)
-- Dependencies: 186
-- Data for Name: students; Type: TABLE DATA; Schema: public; Owner: asmita
--

INSERT INTO students VALUES (1, 'Alex', 'Finance');
INSERT INTO students VALUES (2, 'Anna', 'Computer Science');
INSERT INTO students VALUES (5, 'Simon Garfunkle', 'Graphic Design');
INSERT INTO students VALUES (6, 'Matthew Harbor', 'Physics');
INSERT INTO students VALUES (3, 'Allen', 'Carpentry');


--
-- TOC entry 2270 (class 2606 OID 16394)
-- Name: students students_pkey; Type: CONSTRAINT; Schema: public; Owner: asmita
--

ALTER TABLE ONLY students
    ADD CONSTRAINT students_pkey PRIMARY KEY (id);


-- Completed on 2017-05-21 12:05:51 MDT

--
-- PostgreSQL database dump complete
--

