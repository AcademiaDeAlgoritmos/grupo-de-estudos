// -------------
// Dependẽncias para Ubuntu 18.04
// -------------
// ubuntu openjdk
// ubuntu jre-headless

// Java lang
// JRE (run environment)
// Baixar, Instalar e apontar o jre de /usr/lib/jvm
```
sudo apt-get install default-java

sudo apt-get install default-jre
```
## jdk

Opções:
```
openjdk-11-source        openjdk-8-jdk-headless   openjdk-8-source
openjdk-11-dbg           openjdk-11-jre           openjdk-8-dbg            openjdk-8-jre
openjdk-11-demo          openjdk-11-jre-dcevm     openjdk-8-demo           openjdk-8-jre-dcevm
openjdk-11-doc           openjdk-11-jre-headless  openjdk-8-doc            openjdk-8-jre-headless
openjdk-11-jdk           openjdk-11-jre-zero      openjdk-8-jdk            openjdk-8-jre-zero

```
ex:
```
sudo apt-get install <opção>
```

// Atualizar
```
sudo update-java-alternatives --jre --auto
```

## Errors de versão do compilador

Versões:
// ------------------------------------------
// Java SE 11 = 55 (0x37 hex)
//Java SE 10 = 54 (0x36 hex)
//Java SE 9 = 53 (0x35 hex)
//Java SE 8 = 52 (0x34 hex)
//Java SE 7 = 51 (0x33 hex)
//Java SE 6.0 = 50 (0x32 hex)
//Java SE 5.0 = 49 (0x31 hex)
//JDK 1.4 = 48 (0x30 hex)
//JDK 1.3 = 47 (0x2F hex)
//JDK 1.2 = 46 (0x2E hex)
//JDK 1.1 = 45 (0x2D hex)
// -------------------------------------------

Consulte:
https://docs.oracle.com/en/java/javase/11/tools/javac.html#GUID-AEEC9F07-CB49-4E96-8BC7-BCC2C7F725C9


Caso ocorram, altere os comandos incluindo o target e passando a opção de acordo com compilador que você instalou
como no exemplo passando 8 caso o erro apontado seja 55 para 52.0:

```
javac -target 8 src/Client


```

