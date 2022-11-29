# Notes - Android Mobile App

Notes é um aplicativo de anotações desenvolvido em Kotlin.

## Sobre

Notes permite escrever pequenas anotações e salvá-las em um banco de dados local.
Também é possível definir um nível de prioridade para cada item, organizar e exibir
todas as anotações por nível de maior ou menor prioridade.

## Características

O aplicativo combina diferentes componentes de arquitetura do Android como:

- Navegação entre telas
- base de dados local com a biblioteca ROOM
- LiveData
- ViewModel
- Data Binding, entre outros.

O aplicativo possui três telas: 
- uma tela inicial na qual lista todas as anotações salvas com um menu para pesquisar, organizar ou deletar todos os dados.
- uma tela para adicionar e salvar uma nova anotação.
- uma tela para atualizar um dos campos de uma anotação salva, também permitindo deletá-la atráves do menu.

Implementamos a função Swipe To Delete para deletar uma anotação ao arrastar o dedo sobre ela.

Organizamos a estrutura do projeto seguindo os conceitos de Clean Architecture, separando em diversas pastas
e arquivos, dessa forma, mantendo uma boa legibilidade do código.

## Screenshots

[![Exibição de lista de anotações](https://i.postimg.cc/Pf3w8pmX/notes-demo.png)](https://postimg.cc/grhJC0SQ)

[![Busca de anotações na base de dados](https://i.postimg.cc/BvZzP3Qr/search-demo.png)](https://postimg.cc/hXwsNHms)

[![Adicionar uma nova anotação](https://i.postimg.cc/5NvTZpRR/add-demo.png)](https://postimg.cc/3d8tGj7X)

[![Atualizar uma anotação existente](https://i.postimg.cc/13rTzXP0/update-demo.png)](https://postimg.cc/DSm5j2Sm)

[![Demonstração de base de dados vazia](https://i.postimg.cc/gJm7CBJK/no-data-2.png)](https://postimg.cc/XZ1xFL9Z)

##  Testando o Aplicativo

Baixe o APK para testar o app em seu smartphone ou emulador

```bash
  https://drive.google.com/uc?id=1triMGir__qvcnwQAikKFWKayo4rQRalv&export=download
```
