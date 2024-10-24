<h2 align="center">TRABALHO DE REDES</h2>

<p align="center">

---

### Integrantes do Grupo
- **Grupo 1:** Yuri Alexander, Eduardo Cerreta e Meani 
- **Grupo 2:** Pedro, Miguel e Machado

> **Atenção:** Todos os comandos descritos abaixo devem ser executados no terminal do Linux.

> **Ferramentas Utilizadas:** SSH, Linux, Windows, Apache2, Rotas, Sub-interfaces e Proxy (SQUID e IPTABLES)

---

## Procedimento
1. **Planejamento da Rede**
   - Definir a estrutura da rede, incluindo equipamentos e conexões.
   - **LAN:** 192.168.1.0/24
   - **WAN:** 200.10.10.0/24

2. **Instalar SSH no Linux**
   - Para instalação, siga os comandos:
     ```bash
     sudo apt-get update
     sudo apt-get upgrade
     sudo apt-get install openssh-client
     ```

   - Criação de um novo usuário:
     ```bash
     sudo adduser nome_usuario
     ```

   - Adicionar o usuário ao grupo sudo:
     ```bash
     sudo usermod -aG sudo nome_usuario
     ```

   - Trocar para o superusuário:
     ```bash
     sudo su
     ```

   - Trocar para o novo usuário:
     ```bash
     sudo su nome_usuario
     ```

3. **Instalar Apache2 no Linux**
   - Para instalação, execute os comandos a seguir:
     ```bash
     sudo apt update
     sudo apt install apache2
     ```

   - Iniciar o serviço:
     ```bash
     sudo systemctl start apache2
     ```

   - Criar uma página HTML:
     ```bash
     sudo nano /var/www/html/grupo1.html
     ```

   - Conteúdo básico da página:
     ```html
     <!DOCTYPE html>
     <html lang="pt-BR">
     <head>
         <meta charset="UTF-8">
         <meta name="viewport" content="width=device-width, initial-scale=1.0">
         <title>Página do Grupo 1</title>
     </head>
     <body>
         <h1>Bem-vindo à nossa página!</h1>
         <p>Esta página foi criada com Apache2.</p>
     </body>
     </html>
     ```

   - Para salvar e sair do editor:
     ```bash
     Ctrl + X
     ou
     Y + Enter
     ```

   - Configurar permissões adequadas:
     ```bash
     sudo chown -R www-data:www-data /var/www/html/
     sudo chmod -R 755 /var/www/html/
     ```

   - (Opcional) Permitir o Apache no firewall:
     ```bash
     sudo ufw allow 'Apache'
     ```

   - Abrir o site criado: http://172.25.2.204/grupo1.html

5. **Configurar IPTABLES no Linux**
   - Instalação:
     ```bash
     sudo apt install iptables
     sudo apt install iptables-persistent
     sudo systemctl enable netfilter-persistent
     ```

4. **Criar Sub-interfaces no Linux**
   - Instalar o net-tools:
     ```bash
     sudo apt install net-tools
     ```

   - Mostrar as interfaces de rede:
     ```bash
     sudo ifconfig
     ```

   - Adicionar uma sub-interface (o IP será específico de cada grupo):
     ```bash
     sudo ifconfig enp0s31f6:0 192.168.1.9 netmask 255.255.255.248
     ```

6. **Bloquear Sites com Proxy**
   - Instalar o SQUID:
     ```bash
     sudo apt-get install squid
     ```

   - Verificar se o SQUID está ativo:
     ```bash
     sudo service squid status
     ```

   - Configurar o SQUID:
     ```bash
     cd /etc/squid
     ```

   - Fazer backup da configuração atual:
     ```bash
     sudo cp squid.conf squid.conf.backup
     ```

   - Limpar e criar uma nova configuração:
     ```bash
     sudo rm squid.conf
     sudo nano squid.conf
     ```

   - Criar os arquivos de bloqueio:
     ```bash
     sudo touch /etc/squid/sites_proibidos.txt
     sudo touch /etc/squid/palavras_proibidas.txt
     ```

   - Adicionar as regras no arquivo squid.conf:
     ```bash
     http_port 3128
     acl sites_proibidos url_regex -i "/etc/squid/sites_proibidos.txt"
     http_access deny sites_proibidos
     deny_info http://172.25.2.214/grupo2 sites_proibidos
     ```

   - Reiniciar o SQUID após modificações:
     ```bash
     sudo systemctl stop squid
     sudo systemctl start squid
     ```

6. **Configurar Proxy no Windows 11**
   - Nas configurações de **Rede e Internet**, vá até **Proxy** e desmarque **Detectar configurações automaticamente**.
   - Em configurações manuais, clique em **Editar**, ative, e preencha o **Endereço do Proxy** com o IP do Linux e a **Porta** com 3128.

---

### Progresso
| Tarefa        | Status   | Descrição                                 |
|---------------|:--------:|-------------------------------------------|
| LINUX         |   ✅      | Ambiente operacional para o projeto       |
| SSH           |   ✅      | Conexão remota e segura via terminal      |
| APACHE2       |   ✅      | Servidor web para hospedagem de páginas   |
| SUB-INTERFACE |   ✅      | Configuração de múltiplas interfaces      |
| ROTAS         |   ✅      | Gerenciamento de roteamento na rede       |
| PROXY         |   ✅      | Controle de tráfego externo via proxy     |
| SQUID         |   ✅      | Filtro de acesso através do proxy         |
| IPTABLES      |   ✅      | Regras de firewall para segurança         |
---

### Salvar Configurações
Algumas configurações de IP não permitem navegação externa.

- **Endereço IPv4:** 172.25.2.205
- **Máscara de Sub-rede:** 255.255.255.192
- **Gateway Padrão:** 172.25.2.193
---


<h2 align="center">Links Úteis</h2>

<div align="center">

| Nome     | Link                                               |
|----------|----------------------------------------------------|
| **Dontpad** | [dontpad.com/grupodosfalhosprogramadores](https://dontpad.com/grupodosfalhosprogramadores) |
| **Bloquear** | [pedr0xh.free.nf](http://172.25.2.204/grupo1.html)                         |
| **Grupo 1** | [http://172.25.2.204/grupo1.html](http://172.25.2.204/grupo1.html) |

</div>
