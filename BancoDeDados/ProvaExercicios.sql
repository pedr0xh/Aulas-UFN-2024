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
SELECT A.Nome,D.Nome_disciplina
FROM ALUNO AS A
JOIN HISTORICO_ESCOLAR AS H ON A.Numero_aluno = H.Numero_aluno
JOIN TURMA AS T ON H.Identificacao_turma = T.Identificacao_turma
JOIN DISCIPLINA AS D ON T.Numero_disciplina = D.Numero_disciplina
WHERE A.Nome = 'Silva';


