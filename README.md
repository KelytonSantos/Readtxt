# 📊 Ordenador de Posição em Concurso - Java

Aplicação Java criada para **prever a posição de um candidato em um concurso público**, com base nas **notas da prova objetiva** e **notas de títulos**, extraídas de documentos em formato `.txt`.

## 🧠 Contexto

Esse projeto surgiu de um caso real: minha mãe queria saber sua colocação antes do resultado oficial do concurso ser divulgado. Para isso, criei essa aplicação que:

1. Recebe dois arquivos `.txt` (convertidos manualmente de PDFs);
2. Lê os dados e extrai as notas de cada candidato;
3. Relaciona os dados por número de inscrição
4. Soma as notas da prova e dos títulos;
5. Ordena os candidatos pela nota total;
6. Informa a **posição estimada** de um candidato específico.

## 🛠 Tecnologias e conceitos usados

- Java 21
- Manipulação de arquivos com `File` e `Scanner`
- Estrutura de dados com `Map`, `List`
- Boas práticas de POO (Programação Orientada a Objetos)
- Tratamento de exceções
- Separação de responsabilidades

## 📁 Estrutura do Projeto

O projeto segue boas práticas de organização e separação de responsabilidades:

```bash
src/
└── main/
    ├── java/
    │   └── com/ped/
    │       ├── model/
    │       │   └── Candidato.java             # Representa o candidato com o número d inscrição e notas
    │       ├── service/
    │       │   ├── ProvaAvaliationService.java  # Responsável por ler/processar notas da prova
    │       │   └── TituloAvaliationService.java # Responsável por ler/processar notas de títulos
    │       └── Main.java                       # Ponto de entrada da aplicação
    └──

```
