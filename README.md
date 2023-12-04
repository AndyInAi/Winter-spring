# Winter-spring

```sh

echo "
  deb http://mirrors.tuna.tsinghua.edu.cn/ubuntu/ jammy main restricted universe multiverse
  deb http://mirrors.tuna.tsinghua.edu.cn/ubuntu/ jammy-updates main restricted universe multiverse
  deb http://mirrors.tuna.tsinghua.edu.cn/ubuntu/ jammy-backports main restricted universe multiverse
  deb http://mirrors.tuna.tsinghua.edu.cn/ubuntu/ jammy-security main restricted universe multiverse
" > /etc/apt/sources.list

export DEBIAN_FRONTEND=noninteractive

apt update -y

apt install -y curl wget git openjdk-21-jdk-headless maven

if [ ! -d ~/Winter-spring ]; then cd ~/ ; git clone https://github.com/AndyInAi/Winter-spring.git; fi


# 运行

cd ~/Winter-spring && java -jar Winter-spring-1.0.jar

# starting HTTP server at http://0.0.0.0:8080/

# 测试
curl http://localhost:8080/


# 或者编译源代码后运行

# 编译源代码
cd ~/Winter-spring && ./mvnw clean && ./mvnw package

# 运行
cd ~/Winter-spring && java -jar target/Winter-spring-1.0.jar

# starting HTTP server at http://0.0.0.0:8080/

# 测试
curl http://localhost:8080/

```
