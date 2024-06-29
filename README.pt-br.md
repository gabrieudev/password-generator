# API para gerador de senhas

![Java](https://img.shields.io/badge/Java-8%2B-orange) ![Spring Boot](https://img.shields.io/badge/Spring%20Boot-3-green) [![LinkedIn](https://img.shields.io/badge/Connect%20on-LinkedIn-blue)](https://www.linkedin.com/in/gabrieudev/)
![GPL License](https://img.shields.io/badge/License-GPL-blue)

Seja bem vindo(a) ao meu projeto de **API para gerador de senhas**. 

## Tabela de conteúdos

- [Introdução](#introdução)
- [Funcionalidades](#funcionalidades)
- [Tecnologias](#tecnologias)
- [Iniciando](#iniciando)
- [Endpoints](#endpoints)
- [Contribuições](#contribuições)
- [Contato](#contato)

## Introdução

O projeto foi criado com a proposta de disponibilizar uma API que poderá ser consumida por qualquer sistema que tenha a necessidade de gerar senhas seguras e aleatórias. 

## Funcionalidades

- Método POST com os critérios da senha.
- Visualização da senha gerada.
- Documentação com Swagger.

## Tecnologias

- ![Java](https://img.shields.io/badge/Java-8%2B-orange): Linguagem de programação.
- ![Spring Boot](https://img.shields.io/badge/Spring%20Boot-3-green): Framework usado para a construção de aplicações.

## Iniciando

Siga esses passos para executar o projeto na sua máquina:

1. Clone o repositório: `git clone https://github.com/gabrieudev/password-generator.git`
2. Navegue para o diretório do projeto: `cd <caminho>`
3. Construa a aplicação: `./mvnw clean install` (para Windows: `mvnw.cmd clean install`)
4. Execute a aplicação: `./mvnw spring-boot:run` (para Windows: `mvnw.cmd spring-boot:run`)

## Endpoints

- `POST /generate`: Gera uma senha aleatória de acordo com os critérios no corpo da requisição.

Acesse a documentação no endpoint `/swagger-ui.html`

## Contribuições

Contribuições são muito bem vindas! Caso queira contribuir, faça um fork do repositório e crie um pull request.

## Contato

Caso tenha alguma sugestão ou dúvida, entre em contato comigo em [LinkedIn](https://www.linkedin.com/in/gabrieudev/)

---

**Licença:** Esse projeto é licenciado sob os termos da [GNU General Public License (GPL)](LICENSE).
