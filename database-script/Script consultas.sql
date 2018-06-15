--1...........

SELECT I.Id, I.Nombre 
FROM INVESTIGADOR I
INNER JOIN RESERVA R ON R.IdInvestigador = I.Id
GROUP BY R.IdInvestigador
HAVING COUNT(R.IdInvestigador) > 1

--2...........

SELECT F.Nombre
FROM FACULTAD F
INNER JOIN INVESTIGADOR I ON I.IdFacultad = F.Id
LEFT JOIN RESERVA R ON R.IdInvestigador = I.Id 
WHERE R.IdInvestigador IS NULL