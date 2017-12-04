export class Todo {
    /*
    public nombre: string;
    public terminada: boolean;
    public importante: boolean;

    constructor(nombre, terminada, importante) {
        this.nombre = nombre;
        this.terminada = terminada;
        this.importante = importante;
    }*/

    constructor(
        public nombre: string,
        public terminada: boolean,
        public importante: boolean
    ) {}
}
