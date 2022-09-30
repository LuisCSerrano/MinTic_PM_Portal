USE portal;
CREATE TABLE tb_usuario(

	id_usuario INT NOT NULL AUTO_INCREMENT,
	fecha_registro DATETIME NOT NULL DEFAULT current_timestamp,
 	propietario VARCHAR(255) NOT NULL,
	email VARCHAR(90) NOT NULL,
	usuario VARCHAR(255) NOT NULL,
	pass VARCHAR(255) NOT NULL,
    #rol 0 administrador, 1 colaborador
	rol INT(1) NOT NULL DEFAULT '1',
    #Estado: 1 Activo, 2 Inactivo
	estado INT(1) NOT NULL DEFAULT '1',

	primary key(id_usuario),
    unique key email (email)
);
CREATE TABLE tb_log_login(

	id_log INT NOT NULL AUTO_INCREMENT,
	fecha_registro DATETIME NOT NULL DEFAULT current_timestamp,
 	ref_usuario VARCHAR(255),	
	ref_pass VARCHAR(255) NOT NULL,
	ip VARCHAR(255) NOT NULL,
	sistema_operativo VARCHAR(255) NOT NULL,
	exitoso CHAR(2) NOT NULL, -- si, no
    id_usuario INT NOT NULL,

	primary key(id_log),
    CONSTRAINT  fk_usuario FOREIGN KEY(id_usuario)
   		REFERENCES tb_usuario(id_usuario) ON DELETE cascade ON UPDATE cascade
);
CREATE TABLE tb_empleado(

	id_empleado INT NOT NULL AUTO_INCREMENT,
	fecha_registro DATETIME NOT NULL DEFAULT current_timestamp,
	numero_documento VARCHAR(15) NOT NULL,
	nombre VARCHAR(255) NOT NULL,
	email VARCHAR(255),
	direccion VARCHAR(255),
	telefono BIGINT(20),
	cargo VARCHAR(40),
	profesion VARCHAR(40),
    #Estado: 1 nomina, 2 contratista, 3 exempleado
	estado INT(1) NOT NULL DEFAULT '1',
    id_usuario INT NOT NULL,

	primary key(id_empleado),
  
    CONSTRAINT  fk_usuario_empleado FOREIGN KEY(id_usuario)
   		REFERENCES tb_usuario(id_usuario) ON DELETE cascade ON UPDATE cascade
);

CREATE TABLE tb_cliente(

	id_cliente INT NOT NULL AUTO_INCREMENT,
	fecha_registro DATETIME NOT NULL DEFAULT current_timestamp,
	numero_documento VARCHAR(15) NOT NULL,
	nombre VARCHAR(255) NOT NULL,
	email VARCHAR(255),
	direccion VARCHAR(255),
	telefono VARCHAR(255),
	
	primary key(id_cliente)
);


CREATE TABLE tb_servicio(

	id_servicio INT NOT NULL AUTO_INCREMENT,
	fecha_registro DATETIME NOT NULL DEFAULT current_timestamp,
	nombre VARCHAR(255) NOT NULL,
	descripcion VARCHAR(255),
    #estado 1-activo, 2-cerrado
	estado INT(1) NOT NULL DEFAULT '1',

	primary key(id_servicio)

);

CREATE TABLE tb_proyecto(

	id_proyecto INT NOT NULL AUTO_INCREMENT,
	id_servicio INT NOT NULL,
	id_cliente INT NOT NULL,
    id_empleado INT NOT NULL,
	fecha_registro DATETIME NOT NULL DEFAULT current_timestamp,
	fecha_ejecucion DATE NOT NULL,
	nombre VARCHAR(255) NOT NULL,
	costo float(50),
    #dias de ejecucion del proyecto en dias calendario
	tiempo_estimado int(10),
	descripcion VARCHAR(255),
    # estado 1-Activo, 2-Inactivo
	estado INT(1) NOT NULL DEFAULT '1',

	primary key(id_proyecto),

	CONSTRAINT  fk_servicio FOREIGN KEY(id_servicio)
   		REFERENCES tb_servicio(id_servicio) ON DELETE cascade ON UPDATE cascade,  
	CONSTRAINT  fk_cliente_proyecto FOREIGN KEY(id_cliente)
   		REFERENCES tb_cliente(id_cliente) ON DELETE cascade ON UPDATE cascade,
	CONSTRAINT  fk_empleado_proyecto FOREIGN KEY(id_empleado)
   		REFERENCES tb_empleado(id_empleado) ON DELETE cascade ON UPDATE cascade  
);

CREATE TABLE tb_fase_historial(

	id_fase BIGINT NOT NULL AUTO_INCREMENT,
	id_proyecto INT NOT NULL,
	fecha_registro DATETIME NOT NULL DEFAULT current_timestamp,
    # fase: 1-Planeacion, 2-Ejecucion, 3-Facturacion, 4 Cerrado
	fase INT(1) NOT NULL,
	descripcion VARCHAR(255),

	primary key(id_fase),

	CONSTRAINT  fk_proyecto FOREIGN KEY(id_proyecto)
   		REFERENCES tb_proyecto(id_proyecto) ON DELETE cascade ON UPDATE cascade  
);


CREATE TABLE tb_asignacion(

	id_asignacion BIGINT NOT NULL AUTO_INCREMENT,
	id_proyecto INT NOT NULL,
	id_empleado INT NOT NULL,
	fecha_registro DATETIME NOT NULL DEFAULT current_timestamp,
    #Estado: 1 Asignado, 2 No Asignado
	estado INT(1) NOT NULL DEFAULT '1',

	primary key(id_asignacion),

	CONSTRAINT  fk_proyecto_asignacion FOREIGN KEY(id_proyecto)
   		REFERENCES tb_proyecto(id_proyecto) ON DELETE cascade ON UPDATE cascade,  
	CONSTRAINT  fk_empleado_asignacion FOREIGN KEY(id_empleado)
   		REFERENCES tb_empleado(id_empleado) ON DELETE cascade ON UPDATE cascade  
);
