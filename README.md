install spring cloud vault steps:

git clone https://github.com/spring-guides/gs-vault-config.git <br/>
cd /Users/zhuw099/work/work_flexpass/gs-vault-config  <br/>
cd initial/  <br/>
brew install vault  <br/>
vault server --dev --dev-root-token-id="00000000-0000-0000-0000-000000000000"  <br/>
export VAULT_ADDR='http://127.0.0.1:8200'  <br/>


access URL on Broswer: http://127.0.0.1:8200