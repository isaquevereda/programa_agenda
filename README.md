API Rest com Java 11, Maven, Spring Boot, Spring Data e Banco de Dados MySQL.

Cenário: Agenda online para que os nossos Juízes tenham acesso aos seus compromissos de forma rápida e simples.

Na aplicação deverá ser possível cadastrar um compromisso, alterar um compromisso, remover um compromisso e também que seja listado todos os compromissos de um Juíz em uma determinada data.


POST(garva um compromisso no banco de dados)http://localhost:8080/compromisso

{
  "id":"",
  "tipoCompromisso": "Jantar com o Prefeito",
  "dataCompromisso": "28/07/2021",
  "observacoes": "Jantar com o Prefeito -Secretaria de Segurança Pública"
}

GET (consulta todos os compromissos)http://localhost:8080/compromisso

GET(consulta um compromisso por id)http://localhost:8080/compromisso/{id}

GET(consulta um ou mais compromissos por data)http://localhost:8080/compromisso/buscarPorData?dataCompromisso{dd/MM/yyyy}

DELETE(exclui um compromisso por id)http://localhost:8080/compromisso/{id}

PUT(altera um compromisso por id)http://localhost:8080/compromisso/{id}

{
  "id":"{id}",
  "tipoCompromisso": "Jantar com o Prefeito",
  "dataCompromisso": "28/07/2021",
  "observacoes": "Jantar com o Prefeito -Secretaria de Segurança Pública"
}
