
    create table tb_cliente (
       id integer not null auto_increment,
        dn varchar(255),
        nome varchar(255),
        primary key (id)
    ) engine=InnoDB;

    create table tb_cliente_compras (
       cliente_id integer not null,
        compras_id integer not null
    ) engine=InnoDB;

    create table tb_compras (
       id integer not null auto_increment,
        data_compra date,
        total_compra double precision not null,
        cliente_id integer,
        primary key (id)
    ) engine=InnoDB;

    alter table tb_cliente_compras 
       add constraint UK_qlp33cypwaekdbxanl4qbecok unique (compras_id);

    alter table tb_cliente_compras 
       add constraint FKjhvk8t0visjvw1q8lfd8854pk 
       foreign key (compras_id) 
       references tb_compras (id);

    alter table tb_cliente_compras 
       add constraint FKeecquokgd2qrxgrfl2rehr4xq 
       foreign key (cliente_id) 
       references tb_cliente (id);

    alter table tb_compras 
       add constraint FKto1hl9btn8n1ssr1yglhog601 
       foreign key (cliente_id) 
       references tb_cliente (id);
INSERT INTO tb_cliente(nome, dn) VALUES ('Maria', '14/12/2000');
INSERT INTO tb_cliente(nome, dn) VALUES ('Magali', '13/04/2020');
INSERT INTO tb_compras(cliente_id, total_compra, data_compra) VALUES (1,'100.0', '2021-05-15');
