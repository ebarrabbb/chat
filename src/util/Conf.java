package util;

// Configuración común del servidor y del cliente
public enum Conf {
    APODO_SERVIDOR("SERVIDOR"),
    HOST("localhost"),
    PUERTO(8000),
    MIN_PUERTO(1),
    MAX_PUERTO(65535),
    VERSION_SERVIDOR("0.3.2"),
    VERSION_CLIENTE("0.3.2");

    private final Object o;

    Conf(Object o) {
        this.o = o;
    }

    public int n() {
        return (int)o;
    }

    public String s() {
        return (String)o;
    }
}
