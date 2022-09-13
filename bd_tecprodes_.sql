CREATE DATABASE db_tecprodes;
GO
USE db_tecprodes
GO


CREATE TABLE tb_empleado(

	id_empleado INT NOT NULL IDENTITY(1,1),
	fecha_registro DATETIME NOT NULL DEFAULT GETDATE(),
	numero_documento VARCHAR(15) NOT NULL,
	nombre VARCHAR(255) NOT NULL,
	email VARCHAR(255),
	direccion VARCHAR(255),
	telefono VARCHAR(255),
	cargo VARCHAR(255),
	profesion VARCHAR(255),
	estado CHAR(1) NOT NULL DEFAULT '1',

	primary key(id_empleado)
);


CREATE TABLE tb_cliente(

	id_cliente INT NOT NULL IDENTITY(1,1),
	fecha_registro DATETIME NOT NULL DEFAULT GETDATE(),
	numero_documento VARCHAR(15) NOT NULL,
	nombre VARCHAR(255) NOT NULL,
	email VARCHAR(255),
	direccion VARCHAR(255),
	telefono VARCHAR(255),
	estado CHAR(1) NOT NULL DEFAULT '1',

	primary key(id_cliente)
);


CREATE TABLE tb_contrato_empleado(

	id_contrato INT NOT NULL IDENTITY(1,1),
	id_empleado INT NOT NULL,
	codigo VARCHAR(100) NOT NULL,
	fecha_registro DATETIME NOT NULL DEFAULT GETDATE(),
 	fecha_inicio DATE,	
 	fecha_fin DATE,	
	estado_contrato VARCHAR(255),
	monto VARCHAR(20),
	cargo VARCHAR(255),
	objeto VARCHAR(255),
	descripcion VARCHAR(255),
	
	estado CHAR(1) NOT NULL DEFAULT '1',

	primary key(id_contrato),

	CONSTRAINT  fk_empleado_contrato FOREIGN KEY(id_empleado)
   		REFERENCES tb_empleado(id_empleado) ON DELETE cascade ON UPDATE cascade  

);


CREATE TABLE tb_servicio(

	id_servicio INT NOT NULL IDENTITY(1,1),
	fecha_registro DATETIME NOT NULL DEFAULT GETDATE(),
	nombre VARCHAR(255) NOT NULL,
	descripcion VARCHAR(255),
	estado CHAR(1) NOT NULL DEFAULT '1',

	primary key(id_servicio)

);

CREATE TABLE tb_proyecto(

	id_proyecto INT NOT NULL IDENTITY(1,1),
	id_servicio INT NOT NULL,
	id_cliente INT NOT NULL,
	codigo VARCHAR(100) NOT NULL,
	fecha_registro DATETIME NOT NULL DEFAULT GETDATE(),
	fecha_ejecucion DATE NOT NULL,
	nombre VARCHAR(255) NOT NULL,
	costo VARCHAR(20),
	tiempo_estimado VARCHAR(255),
	descripcion VARCHAR(255),
	estado CHAR(1) NOT NULL DEFAULT '1',

	primary key(id_proyecto),

	CONSTRAINT  fk_servicio FOREIGN KEY(id_servicio)
   		REFERENCES tb_servicio(id_servicio) ON DELETE cascade ON UPDATE cascade,  
	CONSTRAINT  fk_cliente_proyecto FOREIGN KEY(id_cliente)
   		REFERENCES tb_cliente(id_cliente) ON DELETE cascade ON UPDATE cascade  
);

CREATE TABLE tb_fase_historial(

	id_fase BIGINT NOT NULL IDENTITY(1,1),
	id_proyecto INT NOT NULL,
	fecha_registro DATETIME NOT NULL DEFAULT GETDATE(),
	fase VARCHAR(255) NOT NULL,
	descripcion VARCHAR(255),
	estado CHAR(1) NOT NULL DEFAULT '1',

	primary key(id_fase),

	CONSTRAINT  fk_proyecto FOREIGN KEY(id_proyecto)
   		REFERENCES tb_proyecto(id_proyecto) ON DELETE cascade ON UPDATE cascade  
);


CREATE TABLE tb_asignacion(

	id_asignacion BIGINT NOT NULL IDENTITY(1,1),
	id_proyecto INT NOT NULL,
	id_empleado INT NOT NULL,
	fecha_registro DATETIME NOT NULL DEFAULT GETDATE(),
	estado CHAR(1) NOT NULL DEFAULT '1',

	primary key(id_asignacion),

	CONSTRAINT  fk_proyecto_asignacion FOREIGN KEY(id_proyecto)
   		REFERENCES tb_proyecto(id_proyecto) ON DELETE cascade ON UPDATE cascade,  
	CONSTRAINT  fk_empleado_asignacion FOREIGN KEY(id_empleado)
   		REFERENCES tb_empleado(id_empleado) ON DELETE cascade ON UPDATE cascade  
);


CREATE TABLE tb_usuario(

	id_usuario INT NOT NULL IDENTITY(1,1),
	fecha_registro DATETIME NOT NULL DEFAULT GETDATE(),
 	ref_usuario VARCHAR(255),	
	propietario VARCHAR(255) NOT NULL,
	email VARCHAR(255) NOT NULL,
	usuario VARCHAR(255) NOT NULL,
	pass VARCHAR(255) NOT NULL,
	rol CHAR(1) NOT NULL,
	estado CHAR(1) NOT NULL DEFAULT '1',

	primary key(id_usuario)
);

CREATE TABLE tb_log_login(

	id_log INT NOT NULL IDENTITY(1,1),
	fecha_registro DATETIME NOT NULL DEFAULT GETDATE(),
 	ref_usuario VARCHAR(255),	
	ref_pass VARCHAR(255) NOT NULL,
	ip VARCHAR(255) NOT NULL,
	sistema_operativo VARCHAR(255) NOT NULL,
	exitoso CHAR(2) NOT NULL, -- si, no

	primary key(id_log)
);