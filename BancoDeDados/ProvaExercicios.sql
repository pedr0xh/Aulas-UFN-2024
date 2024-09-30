--Questao 8
SELECT A.Nome,D.Nome_disciplina ,H.Nota
FROM ALUNO AS A
JOIN HISTORICO_ESCOLAR AS H ON A.Numero_aluno = H.Numero_aluno
JOIN TURMA AS T ON H.Identificacao_turma = T.Identificacao_turma
JOIN DISCIPLINA AS D ON T.Numero_disciplina = D.Numero_disciplina
WHERE D.Nome_disciplina = 'Banco de dados';

--Questao 9
SELECT D.Nome_disciplina, D2.Nome_disciplina
FROM DISCIPLINA AS D
JOIN PRE_REQUISITO AS P ON D.Numero_disciplina = P.Numero_disciplina
JOIN DISCIPLINA AS D2 ON P.Numero_pre_requisito = D2.Numero_disciplina;

--Questao 10
SELECT A.Nome,D.Nome_disciplina,H.Nota
FROM ALUNO AS A
JOIN HISTORICO_ESCOLAR AS H ON A.Numero_aluno = H.Numero_aluno
JOIN TURMA AS T ON H.Identificacao_turma = T.Identificacao_turma
JOIN DISCIPLINA AS D ON T.Numero_disciplina = D.Numero_disciplina
WHERE A.Nome = 'Silva';

--Questao 11
SELECT Nome, CONVERT(varchar,Data_Nascimento,103) AS DATA_NASCIMENTO
FROM ALUNO;

--Questao 12
SELECT A.Nome, D.Nome_disciplina,
    CASE H.Nota
        WHEN 'A' THEN 10
        WHEN 'B' THEN 9
        WHEN 'C' THEN 8
        WHEN 'F' THEN 0
    END
FROM ALUNO AS A
JOIN HISTORICO_ESCOLAR AS H ON A.Numero_aluno = H.Numero_aluno
JOIN TURMA AS T ON H.Identificacao_turma = T.Identificacao_turma
JOIN DISCIPLINA AS D ON T.Numero_disciplina = D.Numero_disciplina



