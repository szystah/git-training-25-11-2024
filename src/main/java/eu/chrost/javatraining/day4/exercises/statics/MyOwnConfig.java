package eu.chrost.javatraining.day4.exercises.statics;

/*

Zadanie 5: Zarządzanie konfiguracją
1.	Utwórz klasę Config zgodnie ze wzorcem singleton:
o	Prywatne statyczne pole Config instance.
o	Prywatny konstruktor.
o	Publiczną metodę static Config getInstance().
o	Stałe static final String APP_NAME = "MyApp", static final String VERSION = "1.0.0".
o	Publiczne metody:
	String getAppName() – zwraca nazwę aplikacji.
	String getVersion() – zwraca wersję aplikacji.
2.	W metodzie main():
o	Pobierz instancję konfiguracji i wyświetl nazwę oraz wersję aplikacji


 */

public class MyOwnConfig {
    public static final String APP_NAME = "MyApp";
    public static final String VERSION = "1.0.0";

    private static MyOwnConfig instance;

    private MyOwnConfig() {
    }

    public MyOwnConfig getInstance() {
        if (instance == null) {
            return new MyOwnConfig();
        }
        return instance;
    }

    public String getAppName() {
        return APP_NAME;
    }

    public String getVersion() {
        return VERSION;
    }

    public static void main(String[] args) {
        MyOwnConfig myOwnConfigInstance = new MyOwnConfig();
        System.out.println(myOwnConfigInstance.getAppName());
        System.out.println(myOwnConfigInstance.getVersion());
    }
}
