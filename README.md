# 🧐 Muito bom dia, Ladies and Gentlemen


## 👷‍♂️Como Rodar:

Faça Fork do projeto e copie o url:

Entre no netbeans > clique em equipe > Git > Clonar... > Insira a url do seu repositório, a senha do seu repositório, pasta para onde vai ser clonado >  próximo > marque a ramificação > próximo > escolha o diretório > finalizar.


## 🥳 Como Ajudar:

(recomendado que seja pelo git bash)



##### 1. ANTES DE QUALQUER ALTERAÇÃO:

Entre dentro da pasta onde está o projeto > clique com o botão direito > git bash

``````bash
# Configure o git
# remover ()

git remote add origin (urlDoSeuRepositório)			# adiciona o repositório
git pull origin										# 'atualiza' seu repositório
git checkout -b (suaBranch)							# adiciona e muda sua branch atual

``````


##### 2. DEPOIS DE FAZER ALTERAÇÕES:

Entre dentro da pasta onde está o projeto > clique com o botão direito > git bash

``````bash
# Depois de fazer alterações
# remover ()

git status											# conferir alterações
git add (oArquivoAlterado)							# adiciona ao staged
git commit -m ("a Mensagem Do que foi feito")		# adiciona ao commited
git push -u origin (suaBranch)						# envia para o repositório remoto
``````


##### 3. CASO PEÇA O LOGIN DO SSH:

Coloque seu user name > clique em ok > entre em https://github.com/settings/tokens > crie um token > de permissões a ele > finalize > copie o token > cole no campo de texto > clique em ok.



##### 4. DEPOIS DO GIT VEM O GITHUB:

clique em Compare & pull request > adicione comentários necessários > clique em Create pull request > comente a mudança como quiser.
