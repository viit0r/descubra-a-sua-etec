package com.tcc.descubrasuaetec;

import android.content.ContentValues;
import android.content.Context;
import android.database.Cursor;
import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteOpenHelper;
import java.util.ArrayList;

public class BDSQLiteHelper extends SQLiteOpenHelper {

    //private static final String[] COLUNAS = {"idCurso", "nomeCurso", "linkCurso", "descCurso", "profissionalCurso", "tipoCurso"};
    //private static final String[] COLUNAS_CURSOS = {"idEtec", "nomeEtec", "cursoEtec", "etimEtec", "enderecoEtec", "siteEtec", "telEtec"};

    public BDSQLiteHelper(Context context) {
        super(context, "Etec", null, 1);
    }

    @Override
    public void onCreate(SQLiteDatabase db) {

        //  CRIAÇÃO DAS TABELAS USANDO SQLITE

        db.execSQL("create table Unidade (idEtec int primary key, nomeEtec VARCHAR, " +
                "cursoEtec VARCHAR, " +
                "etimEtec VARCHAR, " +
                "enderecoEtec VARCHAR, " +
                "siteEtec VARCHAR, " +
                "telEtec VARCHAR)");

        db.execSQL("create table Curso (idCurso int primary key," +
                "nomeCurso VARCHAR," +
                "descCurso VARCHAR," +
                "profissionalCurso VARCHAR," +
                "tipoCurso VARCHAR," +
                "linkCurso VARCHAR)");

        //TODO
        // INSERÇÃO DE DADOS NAS TABELAS (UNIDADES)

        db.execSQL("insert into Unidade (idEtec, nomeEtec, cursoEtec, etimEtec, enderecoEtec, siteEtec, telEtec) values (1, 'Etec Abdias do Nascimento (Paraisópolis)', 'Contabilidade, Desenvolvimento de Sistemas, Informática, Lojística e Segurança do Trabalho.', 'Sim', 'Rua Dr. José Augusto de Souza de Silva, s/nº - Jardim Parque Morumbi - Paraisópolis - CEP: 05712-040 - São Paulo/SP', ' www.etecparaisopolis.com.br', '(11) 3507-7491')");
        db.execSQL("insert into Unidade (idEtec, nomeEtec, cursoEtec, etimEtec, enderecoEtec, siteEtec, telEtec) values (2, 'Etec Prof. Adhemar Batista Heméritas (Vila Formosa)', 'Admisnistração, Eletroeletrônica, Farmácia e Manutenção e Suporte de Informática', 'Sim', 'Rua Abilene, 16 - Parque Santo Antonio - São Paulo/SP', 'http://www.etecabh.com.br/', '(11) 2301-1058 / 3794-2300')");
        db.execSQL("insert into Unidade (idEtec, nomeEtec, cursoEtec, etimEtec, enderecoEtec, siteEtec, telEtec) values (3, 'Etec Albert Einstein (Casa Verde)', 'Admisnistração, Comunicação Visual, Desenvolvimento de Sistemas, Design de Interiores, Eletrônica, Hospedagem, Informática e Secretariado', 'Sim', 'Rua Nova Granada, 35 - Casa Verde - CEP: 02522-050 - São Paulo/SP' , 'https://www.etecalberteinstein.com.br/', '(11) 3966-0503 / 3858-7529')");
        db.execSQL("insert into Unidade (idEtec, nomeEtec, cursoEtec, etimEtec, enderecoEtec, siteEtec, telEtec) values (4, 'Etec Prof. Aprígio Gonzaga (Penha)', 'Administração, Agenciamento de Viagem, Eletrômecânica, Eletrônica, Secretariado e Segurança do Trabalho', 'Sim', 'Av. Dr. Orêncio Vidigal, 212 - Penha - CEP: 03640-010 - São Paulo/SP' , 'www.etecaprigio.com.br', '(11) 2647-1491')");
        db.execSQL("insert into Unidade (idEtec, nomeEtec, cursoEtec, etimEtec, enderecoEtec, siteEtec, telEtec) values (5, 'Etec de Artes (Santana)', 'Canto, Dança, Design de Interiores, Eventos, Paisagismo, Processos Fotográficos, Regência e Teatro', 'Não', 'Av. Cruzeiro do Sul, 2.630 - Prédio II - Santana - CEP: 02030-100 - São Paulo/SP', 'www.etecdeartes.com.br', '(11) 2089-0740 / 2089-0741')");
        db.execSQL("insert into Unidade (idEtec, nomeEtec, cursoEtec, etimEtec, enderecoEtec, siteEtec, telEtec) values (6, 'Etec Prof. Basílides de Godoy (Vila Leopoldina)', 'Administração, Desenvolvimento de Sistemas, Eletrotécnica, Informática, Mecânica e Mecatrônica', 'Sim', 'Rua Guaipá, 678 - Vila Leopoldina - CEP: 05089-000 - São Paulo/SP' , 'www.basilides.com.br', '(11) 3834-4111 / 3834-4780')");
        db.execSQL("insert into Unidade (idEtec, nomeEtec, cursoEtec, etimEtec, enderecoEtec, siteEtec, telEtec) values (7 ,'Etec Prof. Camargo Aranha (Mooca)', 'Administração, Contabilidade, Cozinha, Desenvolvimento de Sistemas, Eventos, Finanças, Informática, Nutrição e Dietética e Secretariado','Sim' , 'Rua Marcial, 25 - Mooca - CEP: 03169-040 - São Paulo/SP', 'www.eteccamargoaranha.com.br', '(11) 2694-6733 / 2694-4249')");
        db.execSQL("insert into Unidade (idEtec, nomeEtec, cursoEtec, etimEtec, enderecoEtec, siteEtec, telEtec) values (8, 'Etec Carlos de Campos (Brás)', 'Comunicação Visual, Cozinha, Design de Interiores, Edificações, Enfermagem Modelagem do Vestuário e Nutrição e Dietética', 'Sim', 'Rua Monsenhor Andrade, 798 - Brás - CEP: 03009-000 - São Paulo/SP' , 'www.eteccarlosdecampos.com.br', '(11) 3227-0286 / 3311-7098')");
        db.execSQL("insert into Unidade (idEtec, nomeEtec, cursoEtec, etimEtec, enderecoEtec, siteEtec, telEtec) values (9, 'Etec Cepam (Butantã)', 'Orientação Comunitária e Serviços Públicos', 'Sim', 'Av. Prof. Lineu Prestes, 913 - Butantã - CEP: 05508-000 - São Paulo/SP' ,'www.eteccepam.com.br', '(11) 3324-7200')");
        db.execSQL("insert into Unidade (idEtec, nomeEtec, cursoEtec, etimEtec, enderecoEtec, siteEtec, telEtec) values (10, 'Etec Cidade Tiradentes (Cidade Tiradentes)', 'Administração, Farmácia, Logística, Nutição e Dietética, Química e Segurança do Trabalho', 'Sim', 'Rua Igarapé Água Azul, 70 - Cidade Tiradentes - CEP: 08485-310 - São Paulo/SP' ,'www.etecct.com.br', '(11) 2516-6965 / 2516-6966')");
        db.execSQL("insert into Unidade (idEtec, nomeEtec, cursoEtec, etimEtec, enderecoEtec, siteEtec, telEtec) values (11, 'Etec Prof.ª Dr.ª Doroti Quiomi Kanashiro Toyohara (Pirituba)', 'Administração, Contabilidade, Eletroeletrônica e Segurança do Trabalho', 'Sim', 'Rua Ambrósia do México, 180 - Pirituba - CEP: 02945-040 - São Paulo/SP' ,'www.etecpirituba.com.br', '(11) 3972-0199 / 0339')");
        db.execSQL("insert into Unidade (idEtec, nomeEtec, cursoEtec, etimEtec, enderecoEtec, siteEtec, telEtec) values (12, 'Etec de Esportes – Curt Walter Otto Baumgart (Vila Maria)', 'Organização Esportiva', 'Não' , 'Rua Paulo Lorenzani, s/nº Parque Novo Mundo - CEP: 02180-021 - São Paulo - SP', 'www.etecdeesportes.com.br', '(11) 2631-6584 / 2631-6596')");
        db.execSQL("insert into Unidade (idEtec, nomeEtec, cursoEtec, etimEtec, enderecoEtec, siteEtec, telEtec) values (13, 'Etec Getúlio Vargas (Ipiranga)', 'Administração, Automação Industrial, Design de Interiores, Edificações, Eletrônica, Eletrotécnica, Mecânica, Mecatrônica, Meio Ambiente, Nutrição e Dietética, Química e Telecomunicações', 'Sim' , 'Rua Moreira e Costa, 243 - Ipiranga - São Paulo/SP - CEP: 04266-010 - São Paulo/SP', 'www.etegv.com', '(11) 2066-2500 / 2066-2501')");
        db.execSQL("insert into Unidade (idEtec, nomeEtec, cursoEtec, etimEtec, enderecoEtec, siteEtec, telEtec) values (14, 'Etec Gildo Marçal Bezerra Brandão (Perus)', 'Administração, Automação Industrial, Contabilidade, Eletrônica e Logística', 'Sim' , 'Rua Presidente Vargas, s/nº - Vila Caiúba - Perus - CEP: 05207-000 - São Paulo/SP', 'www.etecperus.com', '(11) 3917-8751')");
        db.execSQL("insert into Unidade (idEtec, nomeEtec, cursoEtec, etimEtec, enderecoEtec, siteEtec, telEtec) values (15, 'Etec de Guaianazes (Guaianazes)', 'Administração, Automação Industrial, Desenvolvimento de Sistemas, Edificações, Eletrônica, Eletrotécnica, Informática e Nutrição e Dietética', 'Sim' , 'Rua Feliciano de Mendonça, 290 - Guaianazes - CEP: 08460-365 - São Paulo/SP', 'http://www.etecdeguaianazes.com.br', '(11) 2551-9484 / 2552-0140')");
        db.execSQL("insert into Unidade (idEtec, nomeEtec, cursoEtec, etimEtec, enderecoEtec, siteEtec, telEtec) values (16, 'Etec Guaracy Silveira (Pinheiros)', 'Administração, Design de Móveis, Edificações, Eletrônica, Meio Ambiente e Recursos Humanos', 'Sim' , 'R. Ferreira de Araújo, 527 - Pinheiros - CEP: 05428-001 - São Paulo/SP', 'www.etecguaracy.com.br', '(11) 3031-6208')");
        db.execSQL("insert into Unidade (idEtec, nomeEtec, cursoEtec, etimEtec, enderecoEtec, siteEtec, telEtec) values (17, 'Etec de Heliópolis (Heliópolis)', 'Administração, Desenvolvimento de Sistemas, Edificações, Informática e Nutrição e Dietética', 'Sim' , 'Estrada das Lágrimas, 2461 - Bairro São João Clímaco - Heliópolis - CEP: 04232-000 - São Paulo/SP', 'http://www.etecheliopolis.com.br/', '(11) 2083-2727')");
        db.execSQL("insert into Unidade (idEtec, nomeEtec, cursoEtec, etimEtec, enderecoEtec, siteEtec, telEtec) values (18, 'Etec Prof. Horácio Augusto da Silveira (Vila Guilherme)', 'Administração Contabilidade, Desenvolvimento de Sistemas, Eletrônica, Eletrotécnica, Informática, Logística, Mecânica, Mecatrônica e Rede de Computadores', 'Sim' , 'Rua Alcântara, 113 - Vila Guilherme - CEP: 02110-010 - São Paulo/SP', 'www.etechoracio.com.br', '(11) 2905-1128 / 2905-1125')");
        db.execSQL("insert into Unidade (idEtec, nomeEtec, cursoEtec, etimEtec, enderecoEtec, siteEtec, telEtec) values (19, 'Etec Irmã Agostina (Capela do Socorro)', 'Administração, Desenvolvimento de Sistemas, Informática, Nutrição e Dietética e Química', 'Sim' , 'Av. Feliciano Correa, s/nº - Jardim Satélite - CEP: 04815-240 - São Paulo/SP', 'www.etecia.com.br', '(11) 5667-3971 / 5667-3973')");
        db.execSQL("insert into Unidade (idEtec, nomeEtec, cursoEtec, etimEtec, enderecoEtec, siteEtec, telEtec) values (20, 'Etec de Itaquera (Cohab 2)', 'Administração, Contabilidade, Desenvolvimento de Sistemas e Informática', 'Sim', 'Rua Virginia Ferni, 400 - Conjunto Habitacional José Bonifácio - São Paulo/SP','www.etecitaquera.com.br', '2521-8188 / 2254-7627')");
        db.execSQL("insert into Unidade (idEtec, nomeEtec, cursoEtec, etimEtec, enderecoEtec, siteEtec, telEtec) values (21, 'Etec de Itaquera II (Itaquera)', 'Desenho de Construção Civil, Edificações e Transações Imobiliárias', 'Sim', 'Av. Miguel Ignácio Curi, s/nº - Vila Carmosina - CEP: 08295-005 - Itaquera/SP', 'www.etecitaquera.com.br', '(11) 2056-5142')");
        db.execSQL("insert into Unidade (idEtec, nomeEtec, cursoEtec, etimEtec, enderecoEtec, siteEtec, telEtec) values (22, 'Etec Jaraguá (Jaraguá)', 'Administração, Desenvolvimento de Sistemas, Eletrotécnica, Informática, Informática para Internet e Logística', 'Sim', 'Rua Jairo de Almeida Machado, 401 - Jaraguá - São Paulo/SP - CEP: 02998-060', 'www.etecjaragua.com', '(11) 3941-7242')");
        db.execSQL("insert into Unidade (idEtec, nomeEtec, cursoEtec, etimEtec, enderecoEtec, siteEtec, telEtec) values (23, 'Etec Jardim Ângela (Jardim Ângela)', 'Contabilidade, Desenvolvimento de Sistemas, Informática, Recursos Humanos e Seguraça do Trabalho', 'Sim', 'Estrada da Baronesa, 1695 - Parque Bologne - Jardim Ângela - CEP: 04919-000 - São Paulo/SP', 'www.etecjardimangela.com.br', '(11) 5833-0943')");
        db.execSQL("insert into Unidade (idEtec, nomeEtec, cursoEtec, etimEtec, enderecoEtec, siteEtec, telEtec) values (24, 'Etec José Rocha Mendes (Vila Prudente)', 'Administração, Comunicação Visual, Eletrotécnica e Segurança do Trabalho', 'Sim', 'Rua Américo Vespucci, 1.241 - Vila Prudente - CEP: 03135-010 - São Paulo/SP', 'www.etecjoserochamendes.com.br', '(11) 2063-4454')");
        db.execSQL("insert into Unidade (idEtec, nomeEtec, cursoEtec, etimEtec, enderecoEtec, siteEtec, telEtec) values (25, 'Etec Jornalista Roberto Marinho (Brooklin)', 'Multimídia e  Produção de Áudio e Vídeo', 'Não', 'Avenida Chucri Zaidan, 40 Brooklin - CEP: 04583-110 - São Paulo/SP', 'www.etecjrm.com.br', '(11) 5103-2085')");
        db.execSQL("insert into Unidade (idEtec, nomeEtec, cursoEtec, etimEtec, enderecoEtec, siteEtec, telEtec) values (26, 'Etec Mandaqui (Mandaqui)', 'Edificações, Enfermagem e Nutrição e Dietética', 'Sim' , 'Rua Dr. Luís Lustosa da Silva, 303 - Mandaqui - Jardim Ângela - CEP: 02406-040 - São Paulo/SP','http://www.etecmandaqui.com.br', '(11) 2973-8755 / 2283-6603')");
        db.execSQL("insert into Unidade (idEtec, nomeEtec, cursoEtec, etimEtec, enderecoEtec, siteEtec, telEtec) values (27, 'Etec Drª Maria Augusta Saraiva (Campos Elíseos)', 'Comunicação Visual, Contabilidade, Segurança do Trabalho e Serviços Jurídicos', 'Sim' , 'Rua dos Guaianazes, 1385 - Campos Elíseos - São Paulo/SP - CEP: 01204-001','https://www.etecmas.com/', '(11) 3105-7250 / 3224-0744')");
        db.execSQL("insert into Unidade (idEtec, nomeEtec, cursoEtec, etimEtec, enderecoEtec, siteEtec, telEtec) values (28, 'Etec Martin Luther King (Tatuapé)', 'Administração, Automação Industrial, Manutenção Automotiva, Marketing, Mecânica e Mecatrônica', 'Sim' , 'Rua Apucarana, 815 - Tatuapé - CEP: 03311-000 - São Paulo/SP','www.etecmlk.com.br', '(11) 2093-8636 / 2091-7465')");
        db.execSQL("insert into Unidade (idEtec, nomeEtec, cursoEtec, etimEtec, enderecoEtec, siteEtec, telEtec) values (29, 'Etec Parque Belém (Parque Belém)', 'Administração, Eventos, Informática para Internet, Logística, Nutrição e Dietética, Química e Segurança do Trabalho', 'Sim' , 'Rua Ulisses Cruz, 85 - Belém - CEP: 03064-970 - São Paulo/SP','www.etecpqbelem.com.br', '(11) 2292-0742 / 2291-9293')");
        db.execSQL("insert into Unidade (idEtec, nomeEtec, cursoEtec, etimEtec, enderecoEtec, siteEtec, telEtec) values (30, 'Etec Parque da Juventude (Santana)', 'Arquivo, Biblioteca, Enfermagem, Logística, Marketing e Museologia', 'Sim' , 'Av. Cruzeiro do Sul, 2.630, prédio I - Santana - CEP: 02030-100 - São Paulo/SP','www.etecpj.com.br', '(11) 2221-0098 / 2221-0086')");
        db.execSQL("insert into Unidade (idEtec, nomeEtec, cursoEtec, etimEtec, enderecoEtec, siteEtec, telEtec) values (31, 'Etec Paulistano (Freguesia do Ó)', 'Administração, Desenvolvimento de Sistemas, Informática e Química', 'Sim' , 'Av. Elísio Teixeira Leite, 3.611 - Freguesia do Ó - CEP: 02810-000 - São Paulo/SP','www.etecpaulistano.com.br', '(11) 3979-1120')");
        db.execSQL("insert into Unidade (idEtec, nomeEtec, cursoEtec, etimEtec, enderecoEtec, siteEtec, telEtec) values (32, 'Etec Raposo Tavares (Raposo Tavares)', 'Contabilidade, Desenvolvimento de Sistemas, Logística, Química e Secretariado', 'Sim', 'Rua Cachoeira Poraquê, 326 - Raposo Tavares - CEP: 05574-450 - São Paulo/SP', 'www.etecraposotavares.com.br', '(11) 3782-5782/3782-5529')");
        db.execSQL("insert into Unidade (idEtec, nomeEtec, cursoEtec, etimEtec, enderecoEtec, siteEtec, telEtec) values (33, 'Etec São Mateus (São Mateus)', 'Administração,  Desenvolvimento de Sistemas,  Eletrônica,  Nutrição e Dietética e Segurança do Trabalho', 'Sim', 'Rua Soledade de Minas, 87 - São Mateus - CEP: 03930-070 - São Paulo/SP', 'www.etecsaomateus.com.br', '2721-5111')");
        db.execSQL("insert into Unidade (idEtec, nomeEtec, cursoEtec, etimEtec, enderecoEtec, siteEtec, telEtec) values (34, 'Etec Santa Ifigênia (Santa Ifigênia)', 'Cozinha, Eventos e Hospedagem', 'Sim', 'Rua General Couto de Magalhães, 145 - Luz - CEP: 3224-4108 - São Paulo/SP', 'www.etecsantaifigenia.com.br', '(11) 3224-4108')");
        db.execSQL("insert into Unidade (idEtec, nomeEtec, cursoEtec, etimEtec, enderecoEtec, siteEtec, telEtec) values (35, 'Etec São Paulo (Bom Retiro)', 'Administração,  Automação Industrial,  Desenho de Construção Civil,  Desenvolvimento de Sistemas,  Eventos,  Informática,  Meio Ambiente e Transporte Metroferroviário', 'Sim', 'Rua Coronel Fernando Prestes, 74 - Bom Retiro - CEP: 01124-060 - São Paulo/SP', 'www.etesaopaulo.com.br', '3326-0993 / 3227-1310')");
        db.execSQL("insert into Unidade (idEtec, nomeEtec, cursoEtec, etimEtec, enderecoEtec, siteEtec, telEtec) values (36, 'Etec de Sapopemba (Sapopemba)', 'Administração,  Alimentos, Desenvolvimento de Sistemas, Informática,  Marketing e Redes de Computadores', 'Sim', 'Rua Benjamim de Tudela, 155 - Fazenda da Juta - CEP: 03977-408 - São Paulo/SP', 'www.etecdesapopemba.com.br', '2019-1519 / 2019-1533')");
        db.execSQL("insert into Unidade (idEtec, nomeEtec, cursoEtec, etimEtec, enderecoEtec, siteEtec, telEtec) values (37, 'Etec Sebrae (Campos Elíseos)', 'Administração', 'Sim', 'Alameda Nothmann, 598 - Campos Elíseos - São Paulo/SP - CEP: 01216-000', 'www.etecsebrae.com', '3224-0889')");
        db.execSQL("insert into Unidade (idEtec, nomeEtec, cursoEtec, etimEtec, enderecoEtec, siteEtec, telEtec) values (38, 'Etec Takashi Morita (Santo Amaro)', 'Administração, Automação Industrial, Contabilidade, Eletrônica, Logística e Segurança do Trabalho', 'Sim', 'Av. Mário Lopes Leão, 1.050 A - Santo Amaro - CEP: 04754-010 - São Paulo/SP', 'www.etecsta.com.br', '(11) 5524-7104 / 5521-0636')");
        db.execSQL("insert into Unidade (idEtec, nomeEtec, cursoEtec, etimEtec, enderecoEtec, siteEtec, telEtec) values (39, 'Etec Tereza Aparecida Cardoso Nunes de Oliveira (Arthur Alvim)', 'Automação Industrial, Eletrônica, Eletrotécnica, Recursos Humanos e Secretariado', 'Sim', 'Av. Waldemar Tietz, 1.477 - Conj. Hab. Pd. José de Anchieta - Arthur Alvim - CEP: 03589-001 - São Paulo/SP', 'www.etecterezanunes.com.br', '(11)2741-9563 / 2217-1409')");
        db.execSQL("insert into Unidade (idEtec, nomeEtec, cursoEtec, etimEtec, enderecoEtec, siteEtec, telEtec) values (40, 'Etec de Tiquatira (Penha)', 'Comunicação Visual, Modelagem do Vestuário e Química', 'Sim', 'Av. Condessa Elizabeth de Robiano, 5.200 - Jardim América da Penha - São Paulo/SP', 'www.etectiquatira.com.br', '(11) 2225-2504')");
        db.execSQL("insert into Unidade (idEtec, nomeEtec, cursoEtec, etimEtec, enderecoEtec, siteEtec, telEtec) values (41, 'Etec Uirapuru (Uirapuru)', 'Cozinha, Desenvolvimento de Sistemas, Enfermagem, Informática, Nutrição e Dietética e Segurança do Trabalho', 'Sim', 'Rua Nazir Miguel, 779 - Jd. Paulo XXIII - São Paulo/SP - CEP: 05570-030', 'www.etecuirapuru.com.br', '(11) 3782-5376')");
        db.execSQL("insert into Unidade (idEtec, nomeEtec, cursoEtec, etimEtec, enderecoEtec, siteEtec, telEtec) values (42, 'Etec de Vila Formosa (Vila Formosa)', 'Administração, Comunicação Visual, Contabilidade, Desenvolvimento de Sistemas e Informática', 'Sim', 'Rua Bactória, 38 -Vila Formosa - São Paulo/SP - CEP: 03472-100', 'www.etecdevilaformosa.com.br', '(11) 2211-6485 / 2916-9467')");
        db.execSQL("insert into Unidade (idEtec, nomeEtec, cursoEtec, etimEtec, enderecoEtec, siteEtec, telEtec) values (43, 'Etec da Zona Leste (Cidade A. E. Carvalho)', 'Administração, Contabilidade, Desenvolvimento de Sistemas, Informática, Logística e Serviços Jurídicos', 'Sim', 'Avenida Águia de Haia, 2.633 - Cidade AE Carvalho- São Paulo/SP - CEP: 03694-000', 'www.eteczonaleste.com.br', '(11) 2045-4001 / 2045-4002')");
        db.execSQL("insert into Unidade (idEtec, nomeEtec, cursoEtec, etimEtec, enderecoEtec, siteEtec, telEtec) values (44, 'Etec Carolina Carinhato Sampaio (Jardim São Luís)', 'Administração, Eletrônica e Enfermagem', 'Sim', 'Rua Frederico Grotte, 322 - Jardim Vergueiro - CEP: 05818-270 - São Paulo/SP', 'www.eteczonasul.com.br', '(11) 5851-9315')");


        // INSERÇÃO DE DADOS NAS TABELAS (CURSOS)

        db.execSQL("insert into Curso (idCurso, nomeCurso, descCurso, profissionalCurso, tipoCurso, linkCurso) values " +
                "(1, " +
                "'Administração', " +
                "'Como funcionam as organizações, desde empresas privadas até ONGs, passando por órgãos públicos, comércio e indústria.  O estudante vai precisar de conhecimentos de língua portuguesa, matemática, história e geografia para compreender os principais assuntos do curso, como história da administração, evolução das organizações ao longo do tempo, contabilidade, leis que regulam o funcionamento das empresas e redação de documentos. O aluno vai aprender ainda a analisar as chances de um negócio ou produto ser bem-sucedido e o comportamento do consumidor. Estudará também técnicas de atendimento ao cliente, empreendedorismo (iniciativas para realizar novos negócios) e como uma organização planeja alcançar seus objetivos e define suas metas para o futuro.', " +
                "'O técnico em Administração pode trabalhar em vários departamentos. No setor de compras, por exemplo, pode elaborar pedidos de compra de produtos, cadastrar fornecedores assim como conferir a entrega das mercadorias adquiridas. Na área de produção, pode fazer planilhas de controle de processos e produtos, registrando quais já foram produzidos e em qual quantidade. No departamento de vendas, também pode elaborar planilhas para acompanhar o desempenho das vendas, cadastrar clientes, preencher notas fiscais e gerar boletos bancários. No setor de Recursos Humanos, o técnico pode trabalhar calculando salários e benefícios dos funcionários e auxiliando nos processos de contratação e demissão de pessoal. Em qualquer área, pode atender clientes e fornecedores e redigir documentos, como e-mails, memorandos e atas.', " +
                "'O técnico em Administração pode trabalhar em vários departamentos. No setor de compras, por exemplo, pode elaborar pedidos de compra de produtos, cadastrar fornecedores assim como conferir a entrega das mercadorias adquiridas. Na área de produção, pode fazer planilhas de controle de processos e produtos, registrando quais já foram produzidos e em qual quantidade. No departamento de vendas, também pode elaborar planilhas para acompanhar o desempenho das vendas, cadastrar clientes, preencher notas fiscais e gerar boletos bancários. No setor de Recursos Humanos, o técnico pode trabalhar calculando salários e benefícios dos funcionários e auxiliando nos processos de contratação e demissão de pessoal. Em qualquer área, pode atender clientes e fornecedores e redigir documentos, como e-mails, memorandos e atas.', " +
                "'http://www.portal.cps.sp.gov.br/cursos/etec/administracao.asp')");

        db.execSQL("insert into Curso (idCurso, nomeCurso, descCurso, profissionalCurso, tipoCurso, linkCurso) values "+
                "(2, " +
                "'Agenciamento de Viagem', " +
                "'As matérias básicas do curso são geografia e história. A primeira disciplina serve para o estudante aprender a traçar um roteiro turístico. Já com a segunda, o aluno compreende a história das localidades para informar aos turistas. O técnico formado também recebe a certificação como guia de turismo regional e nacional.', " +
                "'É responsável pela criação de roteiros turísticos e por fazer o acompanhamento do turista durante uma viagem. Pode realizar cotação de viagens e trabalhar como consultor de destinos.', " +
                "'Técnico modular com duração de três semestres.'," +
                "'http://www.portal.cps.sp.gov.br/cursos/etec/agenciamento-de-viagem.asp')");
        db.execSQL("insert into Curso (idCurso, nomeCurso, descCurso, profissionalCurso, tipoCurso, linkCurso) values "+
                "(3, " +
                "'Arquivo', " +
                "'O conteúdo do curso inclui ética e linguagens, como português, inglês e espanhol instrumentais, essenciais para o aluno aprender a interpretar leis e termos técnicos. O estudante também aprende a realizar diagnóstico sobre o estado de conservação de um acervo e a gestão de documentos, ou seja, identificar, preservar, avaliar e arquivar documentos. A grade do curso também conta com a apresentação de conceitos históricos da área de Arquivologia.'," +
                "'Organiza e preserva documentos públicos e privados. Auxilia na busca por documentos específicos. Realiza conservação preventiva para guardar corretamente cada tipo de material. Também é responsável por digitalizar documentos.', " +
                "'Técnico modular com duração de três semestres.', " +
                "'http://www.portal.cps.sp.gov.br/cursos/etec/arquivo.asp')");
        db.execSQL("insert into Curso (idCurso,nomeCurso, descCurso, profissionalCurso, tipoCurso, linkCurso) values "+
                "(4, " +
                "'Automação Industrial', " +
                "'O técnico em Automação Industrial é o profissional que projeta, instala, programa, integra e realiza a manutenção em sistemas aplicados à automação e controle; analisa especificações de componentes e equipamentos que compõem sistemas automatizados; coordena equipes de trabalho e avalia a qualidade de dispositivos e sistemas automatizados. Programa, opera e mantém os sistemas automatizados respeitando normas técnicas de segurança.', " +
                "'Indústrias petroquímicas, automobilísticas, alimentícias e de energia; laboratórios de controle de qualidade, de manutenção e pesquisa; empresas de prestação de serviços e como profissional autônomo.', " +
                "'', " +
                "'http://www.portal.cps.sp.gov.br/cursos/etec/automacao-industrial.asp')");
        db.execSQL("insert into Curso (idCurso, nomeCurso, descCurso, profissionalCurso, tipoCurso, linkCurso) values "+
                "(5, " +
                "'Alimentos', " +
                "'O técnico em Alimentos está apto a atuar no processamento e conservação de matérias-primas, produtos e subprodutos da indústria alimentícia e de bebidas, realizando análises físico-químicas, microbiológicas e sensoriais. Auxilia no planejamento, na coordenação e controle de atividades do setor. Realiza a sanitização das indústrias alimentícias e de bebidas. Controla e corrige desvios nos processos manuais e automatizados. Acompanha a manutenção de equipamentos. Participa do desenvolvimento de novos produtos e processos.', " +
                "'Indústrias de alimentos e bebidas; entrepostos de armazenamento e beneficiamento; laboratórios; institutos de pesquisa e consultoria; órgãos de fiscalização sanitária e proteção ao consumidor; indústria de insumos para processos e produtos.', " +
                "'', " +
                "'http://www.portal.cps.sp.gov.br/cursos/etec/alimentos.asp')");
        db.execSQL("insert into Curso (idCurso, nomeCurso, descCurso, profissionalCurso, tipoCurso, linkCurso) values "+
                "(6, " +
                "'Biblioteca', " +
                "'É importante o aluno gostar de ler. Língua portuguesa é essencial, assim como matemática básica e informática. O conteúdo do curso foca em tipos de bibliotecas, incluindo as digitais, e maneiras de catalogar. O estudante também aprenderá como organizar, tratar e recuperar informação.', " +
                "'Atua como um gestor da informação, realizando a organização das bibliotecas e auxiliando o bibliotecário. Organiza o espaço para transmitir a informação com mais precisão. Realiza pesquisa por temas para auxiliar os leitores. Pode atuar também na organização de documentos em escritórios de advocacia e na área da saúde, por exemplo. Aprende a elaborar eventos culturais e educacionais para despertar o hábito da leitura.', " +
                "'Técnico modular com duração de dois semestres.', " +
                "'http://www.portal.cps.sp.gov.br/cursos/etec/biblioteconomia.asp')");
        db.execSQL(" insert into Curso (idCurso, nomeCurso, descCurso, profissionalCurso, tipoCurso, linkCurso) values "+
                "(7, " +
                "'Canto'," +
                " 'Forma o profissional que interpreta obras musicais de repertórios diversos, desenvolvendo atividades de performance vocal ao vivo e em estúdios de gravação - recitais, óperas, musicais, espetáculos teatrais, shows e eventos. Colabora musicalmente em projetos culturais e atividades de ensino de música e artes cênicas. Trabalha com diferentes gêneros e estilos musicais. Elabora textos técnicos de acordo com os fundamentos e com a terminologia da área profissional.', " +
                "'Corais, conjuntos de música popular e folclórica, grupos de câmara, estúdios de gravação; rádio, televisão, novas mídias e espaços alternativos de interação social, lazer e cultura.', " +
                "''," +
                " 'http://www.portal.cps.sp.gov.br/cursos/etec/canto.asp')");
        db.execSQL("insert into Curso (idCurso, nomeCurso, descCurso, profissionalCurso, tipoCurso, linkCurso) values "+
                "(8, " +
                "'Contabilidade', " +
                "'Matemática e língua portuguesa são disciplinas importantes para entender a contabilidade, que é a ciência responsável por organizar as contas de uma empresa e registrar seus bens patrimoniais (como prédios, veículos e máquinas, entre outros). Além da matemática básica, que serve como ferramenta para calcular o lucro ou o prejuízo de uma empresa, o estudante aprenderá matemática financeira, utilizada para operações de financiamento e cálculo de taxas de juros, por exemplo. O aluno também vai conhecer quais são as regras da contabilidade e todas as leis que estabelecem o que as empresas podem fazer e quais impostos devem pagar. Na área de Informática, o estudante vai aprender a fazer planilhas e a usar programas de computador específicos para a contabilidade.', " +
                "'Ajuda na preparação dos documentos necessários para a abertura ou o encerramento de uma empresa. Calcula os tributos (impostos, taxas e contribuições) que uma empresa deve pagar ao governo. Emite notas fiscais, gera boletos bancários e guias para o pagamento dos tributos. Registra os bens comprados e vendidos pela empresa. Elabora planilhas de controle de bens ou de estoque de mercadorias e produtos. Organiza e arquiva documentos. Auxilia na produção de relatórios diversos referentes às contas da empresa, ao cálculo do lucro ou prejuízo, do desempenho de vendas, das dívidas e dos demais demonstrativos de resultados.', " +
                "'Técnico com duração de três semestres e Técnico integrado ao Ensino Médio.', " +
                "'http://www.portal.cps.sp.gov.br/cursos/etec/contabilidade.asp')");
        db.execSQL("insert into Curso (idCurso, nomeCurso, descCurso, profissionalCurso, tipoCurso, linkCurso) values "+
                "(9, " +
                "'Comunicação Visual', " +
                "'Projeta e executa projetos de comunicação visual de diferentes gêneros e formatos gráficos para peças publicitárias como livros, portais, painéis, folderes, jornais. Desenvolve e emprega elementos criativos e estéticos. Cria ilustrações, aplica tipografias, desenvolve elementos de identidade visual de peças. Controla, organiza e armazena materiais físicos e digitais da produção gráfica.', " +
                "'Agências de publicidade, editoras, bureau gráficos; escritórios de design e gráficas.', " +
                "'', " +
                "'http://www.portal.cps.sp.gov.br/cursos/etec/comunicacao-visual.asp')");
        db.execSQL("insert into Curso (idCurso, nomeCurso, descCurso, profissionalCurso, tipoCurso, linkCurso) values "+
                "(10, " +
                "'Cozinha', " +
                "'O conteúdo do curso tem foco nas técnicas de preparação em uma cozinha. São noções que vão desde aprender os métodos de cocção (processo de aplicação de calor) e armazenamento de alimentos, até a execução de cortes e história da gastronomia. A grade curricular inclui elementos básicos de física, biologia e química para entender a base nutricional dos alimentos e como ocorrem as alterações nos alimentos quando se prepara um novo prato. Matemática é importante para desenvolver fichas técnicas. O estudante também aprende temas específicos dentro da área, como a panificação e a confeitaria.', " +
                "'Trabalha como auxiliar ou cozinheiro. Prepara e organiza ingredientes e produtos que serão utilizados em um prato. Também pode auxiliar no desenvolvimento do cardápio.', " +
                "'Técnico modular com duração de três semestres e Técnico Integrado ao Ensino Médio.', " +
                "'http://www.portal.cps.sp.gov.br/cursos/etec/cozinha.asp')");
        db.execSQL("insert into Curso (idCurso, nomeCurso, descCurso, profissionalCurso, tipoCurso, linkCurso) values "+
                "(11, " +
                "'Dança', " +
                "'Desenvolve atividades ligadas à criação e à execução de dança, atuando como bailarino, dançarino, diretor ou assistente de palco. Emprega técnicas de dança e recursos de improvisação, em espaços cênicos, como formas de expressão corporal. Atua como instrutor ou arte educador em espaços não formais.', " +
                "'Casas de espetáculo, teatros e espaços alternativos de interação social, lazer e cultura; corpos de baile; festivais, mostras e eventos de naturezas diversas; instituições públicas, privadas e terceiro setor.', " +
                "'', " +
                "'http://www.portal.cps.sp.gov.br/cursos/etec/danca.asp')");
        db.execSQL("insert into Curso (idCurso, nomeCurso, descCurso, profissionalCurso, tipoCurso, linkCurso) values "+
                "(12, " +
                "'Desenho de Construção Civil', " +
                "'Desenvolve atividades relativas ao estudo do planejamento de projetos e de obras, sob a óptica de aspectos técnico-econômicos, socioambientais, urbanísticos, históricos e legais. Analisa projetos e define a metodologia de trabalho, dimensionando a equipe de desenhistas e determinando os prazos para de elaboração. Prepara orçamentos. Executa desenhos técnicos de projetos. Utiliza, no desenvolvimento de suas atividades, ferramentas gráficas tradicionais, computacionais e maquetes.', " +
                "'Empresas públicas, privadas, do terceiro setor, de maquetes físicas e eletrônicas; escritórios de projetos de arquitetura, engenharia civil e/ou infraestrutura e de instalações; imobiliárias e construtoras; profissional autônomo.'," +
                " '', " +
                "'http://www.portal.cps.sp.gov.br/cursos/etec/desenho-de-construcao-civil.asp')");
        db.execSQL("insert into Curso (idCurso, nomeCurso, descCurso, profissionalCurso, tipoCurso, linkCurso) values "+
                "(13, " +
                "'Desenvolvimento de Sistemas'," +
                " 'É o profissional que analisa e projeta sistemas. Constrói, documenta, realiza testes e mantém sistemas de informação. Utiliza ambientes de desenvolvimento e linguagens de programação específica. Modela, implementa e mantém bancos de dados.', " +
                "'Empresas e departamentos de desenvolvimento de sistemas em organizações governamentais e não governamentais, podendo também atuar como profissional autônomo.', " +
                "'', " +
                "'http://www.portal.cps.sp.gov.br/cursos/etec/desenvolvimento-de-sistemas.asp')");
        db.execSQL("insert into Curso (idCurso, nomeCurso, descCurso, profissionalCurso, tipoCurso, linkCurso) values "+
                "(14, " +
                "'Design de Interiores', " +
                "'O técnico participa da elaboração e da execução de projetos de espaços residenciais, comerciais e exposições, visando à estética, à melhoria dos aspectos funcionais, ergonômicos dos ambientes, para atender às necessidades dos usuários. Desenvolve esboços, perspectivas e desenhos de acordo com normas técnicas. Planeja e organiza o espaço, identificando elementos básicos para a concepção do projeto. Representa os elementos de projeto no espaço bidimensional e tridimensional, aplicando métodos de representação gráfica.', " +
                "'Escritórios de design, empresas e escritórios de projetos de interiores, construtoras e imobiliárias; lojas de móveis e decoração, shoppings e outros estabelecimentos comerciais.', " +
                "'', " +
                "'http://www.portal.cps.sp.gov.br/cursos/etec/design-de-interiores.asp')");
        db.execSQL("insert into Curso (idCurso, nomeCurso, descCurso, profissionalCurso, tipoCurso, linkCurso) values "+
                "(15, " +
                "'Design de Móveis', " +
                "'Utilizando conceitos de sustentabilidade, desenvolve esboços e perspectivas; realiza estudos volumétricos e maquetes convencionais e eletrônicas; aplica aspectos ergonômicos ao projeto. Pesquisa e define materiais, ferragens e acessórios. Elabora documentação técnica normatizada. Acompanha processos de produção.', " +
                "'Escritório de design, indústrias moveleira lojas de móveis e de decoração; representações comerciais.', " +
                "'', " +
                "'http://www.portal.cps.sp.gov.br/cursos/etec/design-de-moveis.asp')");
        db.execSQL("insert into Curso (idCurso, nomeCurso, descCurso, profissionalCurso, tipoCurso, linkCurso) values "+
                "(16, " +
                "'Edificações', " +
                "'Desenvolve e executa projetos. Planeja a execução, elabora orçamento e memorial descritivo. Supervisiona a realização de diferentes etapas do processo construtivo. Presta assistência técnica no estudo e desenvolvimento de projetos, pesquisas e controle tecnológico de materiais. Orienta e coordena serviços de manutenção de equipamentos e de instalações. Orienta na assistência técnica para compra, venda e utilização de produtos e equipamentos especializados.', " +
                "'Empresas públicas, privadas e do terceiro setor na área de Construção Civil e interfaces; escritórios de projetos e de construção civil; canteiros de obras.', " +
                "'', " +
                "'http://www.portal.cps.sp.gov.br/cursos/etec/edificacoes.asp')");
        db.execSQL("insert into Curso (idCurso, nomeCurso, descCurso, profissionalCurso, tipoCurso, linkCurso) values "+
                "(17, " +
                "'Eletroeletrônica', " +
                "'Planeja serviços de manutenção e instalação e realiza manutenções preventivas, preditivas e corretivas. Instala sistemas e componentes.  Realiza medições e testes, como também desenvolve e executa projetos de instalações elétricas, circuitos eletrônicos e automação. Elabora documentação técnica. Planeja, instala e faz a manutenção de equipamentos e instalações eletroeletrônicas industriais. Projeta e instala sistemas de acionamento e controle. Propõe o uso eficiente da energia elétrica. Elabora, desenvolve e executa projetos de instalações elétricas em edificações em baixa tensão.', " +
                "'Indústria eletroeletrônica, de manufatura e de processos, empresas de manutenção e automação, laboratórios de controle e de qualidade, de manutenção e pesquisa, empresas de consultoria na área, desenvolvimento de projetos e prestação de serviços.', " +
                "'', " +
                "'http://www.portal.cps.sp.gov.br/cursos/etec/eletroeletronica.asp')");
        db.execSQL("insert into Curso (idCurso, nomeCurso, descCurso, profissionalCurso, tipoCurso, linkCurso) values "+
                "(18, " +
                "'Eletromecânica', " +
                "'O curso forma profissionais para atuar no projeto e na execução de instalações elétricas e mecânicas de equipamentos industriais, conforme especificações técnicas, normas de segurança e com responsabilidade ambiental. O técnico também exerce atividades de planejamento e execução da manutenção elétrica e mecânica de equipamentos industriais,além de projeto, de instalação e de manutenção de sistemas de acionamento elétrico e mecânico.', " +
                "'Empresas de manutenção e automação industrial; indústrias; laboratórios de controle de qualidade, de manutenção e de pesquisa; concessionárias do setor de energia.', " +
                "'', " +
                "'http://www.portal.cps.sp.gov.br/cursos/etec/eletromecanica.asp')");
        db.execSQL("insert into Curso (idCurso, nomeCurso, descCurso, profissionalCurso, tipoCurso, linkCurso) values "+
                "(19, " +
                "'Eletrônica', " +
                "'Participa do desenvolvimento de projetos. Executa a instalação e a manutenção de equipamentos e sistemas eletrônicos e de automação. Faz medições e testes com equipamentos eletrônicos. Realiza procedimentos de controle de qualidade e gestão da produção de equipamentos eletrônicos.', " +
                "'Indústrias; laboratórios de controle de qualidade e de manutenção; empresas de informática, de telecomunicações e de produtos eletrônicos.', " +
                "'', " +
                "'http://www.portal.cps.sp.gov.br/cursos/etec/eletronica.asp')");
        db.execSQL("insert into Curso (idCurso, nomeCurso, descCurso, profissionalCurso, tipoCurso, linkCurso) values "+
                "(20, " +
                "'Eletrotécnica', " +
                "'O técnico instala, opera e mantém elementos de geração, transmissão e distribuição de energia; participa da elaboração e do desenvolvimento de instalações elétricas e de infraestrutura para sistemas de telecomunicações em edificações; planeja e executa a instalação e a manutenção de equipamentos e instalações; aplica medidas para o uso eficiente da energia e de fontes energéticas alternativas. Participa do projeto e instala sistemas de acionamentos elétricos. Executa a instalação e manutenção de iluminação e sinalização de segurança.', " +
                "'Concessionárias do setor de energia elétrica; indústrias.', " +
                "'', " +
                "'http://www.portal.cps.sp.gov.br/cursos/etec/eletrotecnica.asp')");
        db.execSQL("insert into Curso (idCurso, nomeCurso, descCurso, profissionalCurso, tipoCurso, linkCurso) values "+
                "(21, " +
                "'Enfermagem', " +
                "'O aluno aprende técnicas para auxiliar na recuperação de um paciente, assim como a prevenção de doenças, orientação para exames, entre outros procedimentos. O curso tem base na biologia, para aprender sobre o corpo humano; na matemática, para cálculos de medida para medicações; na física, para entender os riscos que o paciente corre, como a velocidade de uma batida de um veículo para entender os tipos de lesões possíveis, por exemplo; e português, para escrever corretamente no prontuário do paciente.', " +
                "'O técnico cumpre função assistencial ao enfermeiro, como cuidados básicos em pacientes graves, aplicação de vacina, dar um banho em um paciente, auxiliar em exames, entre outras funções. Pode atuar na área administrativa, na prevenção e pode montar ações educativas, na área de segurança do trabalho.', " +
                "'Técnico modular com duração de quatro semestres.', " +
                "'http://www.portal.cps.sp.gov.br/cursos/etec/enfermagem.asp')");
        db.execSQL("insert into Curso (idCurso, nomeCurso, descCurso, profissionalCurso, tipoCurso, linkCurso) values "+
                "(22, " +
                "'Eventos', " +
                "'O tecnólogo desta área presta serviços especializados no planejamento, organização e execução de eventos de negócios, sociais, esportivos, culturais, científicos, artísticos, de lazer e outros. Deve ter o domínio dos códigos funcionais e dos processos de interação dinâmica de todos os agentes integrados ao turismo e os variados aspectos culturais, econômicos e sociais da região em que atua, com consciência crítica acerca das orientações éticas, ambientais e legais.', " +
                "'Empresas de eventos; organismos municipais e estaduais', " +
                "'', " +
                "'http://www.portal.cps.sp.gov.br/cursos/etec/eventos.asp')");
        db.execSQL("insert into Curso (idCurso, nomeCurso, descCurso, profissionalCurso, tipoCurso, linkCurso) values "+
                "(23, " +
                "'Farmácia', " +
                "'O curso tem base na química, para maior compreensão sobre os elementos utilizados em farmácias de manipulação; na biologia, para entender as reações que as medicações causam no corpo humano; na matemática, para fazer cálculos de miligramas na orientação aos pacientes e no inglês instrumental. O aluno também aprende sobre logística, ética e gestão farmacêutica.', " +
                "'Manipula medicamentos, realiza testes de controle de qualidade, auxilia nas rotinas das farmácias, no armazenamento dos medicamentos e no controle do estoque. Orienta os pacientes sobre receitas medicas, conservação e uso correto de cada medicamento', " +
                "'Técnico modular com duração de três semestre', " +
                "'http://www.portal.cps.sp.gov.br/cursos/etec/farmacia.asp')");
        db.execSQL("insert into Curso (idCurso, nomeCurso, descCurso, profissionalCurso, tipoCurso, linkCurso) values "+
                "(24, " +
                "'Finanças', " +
                "'Português, matemática e geografia são disciplinas básicas para a compreensão do curso de Finanças. Essa base vai ser importante para aprender, por exemplo, matemática financeira e economia, que são fundamentais para analisar relatórios que expliquem a situação financeira de uma empresa – lucros obtidos, dívidas a pagar, entre outros. O estudante vai aprender a analisar diversas operações financeiras, como financiamentos, empréstimos e aplicações. Também aprenderá a apurar resultados para verificar as possibilidades de um negócio ser bem-sucedido. Durante o curso, o aluno vai conhecer as leis que regulam o funcionamento das empresas e vai aprender a elaborar documentos como notas fiscais, orçamento e recibos de pagamento. O aluno vai aprender também a fazer planilhas no computador para registrar e analisar informações.', " +
                "'O técnico em Finanças pode trabalhar registrando o fluxo de caixa de uma empresa, isto é, a entrada e a saída de dinheiro, elaborando planilhas diversas, como das contas a pagar e a receber, e auxiliando na conferência dos extratos bancários da empresa. O profissional também realiza cobrança de dívidas, negociando o pagamento em parcelas ou oferecendo descontos. O técnico pode ainda analisar operações de crédito, como empréstimos e financiamentos, tanto para empresas como para consumidores.', " +
                "'Técnico com duração de três semestres.', " +
                "'http://www.portal.cps.sp.gov.br/cursos/etec/financas.asp')");
        db.execSQL("insert into Curso (idCurso, nomeCurso, descCurso, profissionalCurso, tipoCurso, linkCurso) values "+
                "(25, " +
                "'Hospedagem', " +
                "'Atendimento ao cliente na recepção de hotéis e em diversos tipos de meios de hospedagem. Também aprende técnicas de arrumação das áreas socias e de hospedagem do hotel. Gostar de português e inglês é fundamental, tendo em vista a comunicação exigida no tratamento com hóspedes e clientes.', " +
                "'É responsável por cuidar da hospedagem do cliente, desde sua reserva até o momento em que ele deixa o hotel. Também atua no departamento de governança, responsável pela organização e limpeza das áreas sociais e de hospedagem. Pode trabalhar nos departamentos de eventos, restaurante e recreação.', " +
                "'Técnico modular com duração de dois semestres, Técnico Integrado ao Ensino Médio e Ensino Médio com Habilitação Técnica Profissional em Hospedagem (Curso Técnico) – MTec.', " +
                "'http://www.portal.cps.sp.gov.br/cursos/etec/hospedagem.asp')");
        db.execSQL("insert into Curso (idCurso, nomeCurso, descCurso, profissionalCurso, tipoCurso, linkCurso) values "+
                "(26, " +
                "'Informática', " +
                "'O técnico em Informática desenvolve e opera sistemas, aplicações e interfaces gráficas. Monta estruturas de banco de dados e codifica programas. Projeta, implanta e realiza manutenção de sistemas e aplicações. Seleciona recursos de trabalho, linguagens de programação, ferramentas e metodologias para o desenvolvimento de sistemas.', " +
                "'Instituições públicas, privadas e do terceiro setor que demandem sistemas computacionais, especialmente envolvendo programação de computadores.', " +
                "'', " +
                "'http://www.portal.cps.sp.gov.br/cursos/etec/informatica.asp')");
        db.execSQL("insert into Curso (idCurso, nomeCurso, descCurso, profissionalCurso, tipoCurso, linkCurso) values "+
                "(27, " +
                "'Informática para Internet', " +
                "'O processo de criação de sites e o de desenvolvimento de programas que podem ser utilizados em páginas na internet. Para programar, o aluno vai estudar raciocínio lógico e linguagens de programação, que utiliza comandos para desenvolver funcionalidades e dar forma a um site. Além disso, o estudante aprenderá um pouco de design com o objetivo de tornar a página mais agradável e fácil de ser utilizada. O aluno aprenderá ainda como criar e alterar bancos de dados que vão alimentar os sites. Noções de marketing digital para a web e de empreendedorismo também serão ensinadas ao longo do curso.', " +
                "'Cria websites de acordo com as necessidades do cliente, identificando e sugerindo as melhores soluções; faz a manutenção de portais, sites e intranets; cuida da identidade visual das páginas de uma empresa; faz a customização de plataformas de conteúdo para web, como blogs e sites de comércio eletrônico; cria e realiza manutenção de bancos de dados para websites; adapta as páginas para abrigar vídeos, áudios e funções que facilitem a acessibilidade, como comandos de voz, por exemplo; trata e otimiza imagens para uso na internet; e prepara o layout de mensagens que são enviadas por e-mail (newsletter ou e-mail marketing), entre outras atividades.', " +
                "'Técnico com duração de três semestres, Técnico integrado ao Ensino Médio e Ensino Médio com Habilitação Técnica Profissional.', " +
                "'http://www.portal.cps.sp.gov.br/cursos/etec/informatica-para-internet.asp')");
        db.execSQL("insert into Curso (idCurso, nomeCurso, descCurso, profissionalCurso, tipoCurso, linkCurso) values "+
                "(28, " +
                "'Logística', " +
                "'Logística é o planejamento do caminho feito por um produto ou serviço até chegar ao cliente de forma organizada, rápida e econômica. Para planejar esse caminho, o estudante vai precisar de conhecimentos de matemática, geografia e física. O aluno aprenderá sobre os processos de compra de matérias-primas, incluindo a escolha dos fornecedores, o registro dos pedidos de compra e o recebimento dos materiais adquiridos. O estudante vai aprender também como se deve movimentar as cargas e os produtos dentro de um estoque para decidir se utilizará, por exemplo, um carrinho ou uma empilhadeira, e como se deve armazenar cada tipo de produto e por quanto tempo. Vai estudar ainda sobre a entrega das mercadorias compradas pelos clientes: como organizar a carga para o transporte, qual a embalagem mais adequada (em caixas de papelão ou madeira, em páletes ou contêineres), qual é o tipo de transporte mais adequado para o produto e para o cliente (caminhões, embarcações, trem ou avião), e quais são as principais rotas que podem ser utilizadas. Além disso, o estudante aprenderá sobre os custos envolvidos em cada uma das atividades.', " +
                "'Pesquisa preços com fornecedores para elaborar orçamentos de compra de produtos e de transporte de mercadorias; controla a entrada e a saída de mercadorias do estoque; confere os produtos recebidos de acordo com a nota fiscal, verificando defeitos, prazos de validades, além de resolver os procedimentos para a devolução dos itens com problema; separa no estoque as mercadorias que foram compradas para serem despachadas; dimensiona as quantidades de cargas e de produtos que cabem em cada tipo de transporte (moto, caminhão, navio, avião) e em cada local de estoque; pesquisa e sugere opções de transporte e rotas conforme a carga; realiza o rastreamento do produto ou mercadoria que está sendo transportado e acompanha o fluxo de entrega para alimentar os bancos de dados da empresa.', " +
                "'Técnico com duração de três semestres, Técnico integrado ao Ensino Médio e Ensino Médio com Habilitação Técnica Profissional.', " +
                "'http://www.portal.cps.sp.gov.br/cursos/etec/logistica.asp')");
        db.execSQL("insert into Curso (idCurso, nomeCurso, descCurso, profissionalCurso, tipoCurso, linkCurso) values "+
                "(29, " +
                "'Manutenção Automotiva', " +
                "'O profissional realiza diagnóstico, manutenção e instalação de equipamentos, dispositivos e acessórios em veículos. Avalia e busca melhorias quanto à emissão de gases poluentes e às condições gerais de funcionamento e segurança do veículo. Coordena equipe de mecânicos para os diversos tipos de automóveis, realiza reparos mecânicos e eletroeletrônicos, manipula instrumentos de testes e diagnósticos. Elabora planos de logísticas de manutenção preventiva e corretiva. Aplica e utiliza ferramentas na execução de serviços. Analisa ruídos e inspeciona segurança veicular.', " +
                "'Oficinas mecânicas, locadoras de veículos, retíficadoras de motores e sistema de transmissão, transportadoras e frotistas, montadoras de veículos, indústrias e distribuidoras de autopeças, concessionárias, campos de prova de veículos, empresas de modificação e adaptação de veículos, centros automotivos e centros de Inspeção Veicular.', " +
                "'', " +
                "'http://www.portal.cps.sp.gov.br/cursos/etec/manutencao-automotiva.asp')");
        db.execSQL("insert into Curso (idCurso, nomeCurso, descCurso, profissionalCurso, tipoCurso, linkCurso) values "+
                "(30, " +
                "'Manutenção e Suporte em Informática', " +
                "'O estudante vai aprender como instalar, configurar e realizar a manutenção de computadores e seus periféricos, como impressoras, no-breaks e drives, entre outros, utilizando conhecimentos de Informática e de Eletrônica. Na área de computação, o aluno vai estudar configuração de sistemas operacionais, estrutura dos computadores e do cabeamento de redes, linguagem de programação e de banco de dados e procedimentos para segurança da informação. Conceitos de matemática e física também estarão presentes ao longo do curso como base para o aprendizado de lógica, programação, eletricidade e eletrônica. Para completar a formação, o estudante aprenderá sobre empreendedorismo e organização de tarefas para a realização de projetos de manutenção.', " +
                "'Realiza reparos em computadores e nos seus periféricos, troca partes e peças, desmonta e remonta equipamentos e solda componentes eletrônicos de peças e placas. É responsável também pela manutenção dos equipamentos de informática, serviço que o técnico pode realizar na própria empresa onde trabalha ou no local onde está instalado o periférico, caso o aparelho seja de grande porte, como, por exemplo, as impressoras utilizadas por agências bancárias. Além disso, o profissional é capaz de verificar e avaliar se as instalações elétricas de uma empresa são adequadas aos equipamentos de informática que serão utilizados.', " +
                "'Técnico com duração de três semestres.', " +
                "'http://www.portal.cps.sp.gov.br/cursos/etec/manutencao-e-suporte-em-informatica.asp')");
        db.execSQL("insert into Curso (idCurso, nomeCurso, descCurso, profissionalCurso, tipoCurso, linkCurso) values "+
                "(31, " +
                "'Marketing', " +
                "'O estudante vai aprender que marketing é mais do que publicidade. É um processo que começa por entender as necessidades do consumidor para desenvolver produtos, serviços e ideias que serão comercializados. Para estudar esse assunto, o aluno vai precisar de conhecimentos de língua portuguesa, geografia e matemática. O estudante vai aprender a definir o público-alvo de cada produto ou serviço, assim como aprenderá a analisar esse processo de aproximação e troca entre vendedores e compradores. O aluno estudará, ainda, as formas de utilizar as ferramentas de comunicação, como publicidade, telemarketing, promoção de vendas etc. No curso, o estudante vai aprender também a criar logotipos, rótulos e embalagens. Administração de empresas, Legislação (como o Código de Defesa do Consumidor) e Inglês e Espanhol para leitura de textos completam a formação técnica em Marketing.', " +
                "'Pode elaborar pesquisas de mercado para identificar o comportamento do consumidor. No ponto de venda (como supermercados, shoppings, lojas etc.), pode realizar a demonstração de produtos e montar peças e materiais de promoção, além de negociar espaços para melhor expor os produtos que serão vendidos. Pode trabalhar elaborando orçamento para a execução de ações (como promoções, propagandas etc.), calculando quanto se vai gastar para realizar cada uma. O técnico em Marketing pode ainda acompanhar as ações para verificar se os resultados foram positivos ou negativos. Em pequenas empresas, pode criar logotipos, rótulos e gerar conteúdo para as redes sociais.', " +
                "'Técnico com duração de três semestres, Técnico integrado ao Ensino Médio, Ensino Médio com Qualificação Profissional e Ensino Médio com Habilitação Técnica Profissional.', " +
                "'http://www.portal.cps.sp.gov.br/cursos/etec/marketing.asp')");
        db.execSQL("insert into Curso (idCurso, nomeCurso, descCurso, profissionalCurso, tipoCurso, linkCurso) values "+
                "(32, " +
                "'Mecânica', " +
                "'O técnico em Mecânica é o profissional que elabora projetos mecânicos e sistemas automatizados. Monta e instala máquinas e equipamentos. Planeja e realiza manutenção. Desenvolve processos de fabricação e montagem de conjuntos mecânicos. Elabora documentação, realiza compras e vendas técnicas e cumpre normas e procedimentos de segurança no trabalho e preservação ambiental.', " +
                "'Indústrias, fábricas de máquinas, equipamentos e componentes mecânicos. Laboratórios de controle de qualidade, de manutenção e pesquisa no setor produtivo mecânico; prestadoras de serviços.', " +
                "'', " +
                "'http://www.portal.cps.sp.gov.br/cursos/etec/mecanica.asp')");
        db.execSQL("insert into Curso (idCurso, nomeCurso, descCurso, profissionalCurso, tipoCurso, linkCurso) values "+
                "(33, " +
                "'Mecatrônica', " +
                "'É o curso que forma o profissional que atua no projeto, na execução, na instalação e na manutenção de máquinas e equipamentos automatizados e sistemas robotizados. Ele também opera equipamentos, utiliza softwares específicos e linguagens de programação adequadas; coordena equipes e oferece treinamento operacional; programa e opera máquinas; realiza manutenções preditiva, preventiva e corretiva, em conformidade com as normas técnicas.', " +
                "'Indústria automobilística e metal-mecânica; fabricantes de máquinas, componentes e equipamentos robotizados; laboratórios de controle de qualidade e prestadoras de serviço.', " +
                "'', " +
                "'http://www.portal.cps.sp.gov.br/cursos/etec/mecatronica.asp')");
        db.execSQL("insert into Curso (idCurso, nomeCurso, descCurso, profissionalCurso, tipoCurso, linkCurso) values "+
                "(34, " +
                "'Meio Ambiente', " +
                "'O curso tem base em duas disciplinas principais: biologia e química. A primeira, para aprender sobre a diversidade da vida, compreensão de ecossistema, as relações entre os seres vivos e ciclo da matéria no ambiente. A segunda, para compreensão de métodos de separação de matéria. O aluno também aprenderá interpretação de texto para entender normas técnicas, resoluções, portarias e decretos. Também fazem parte da grade aulas direcionadas a equipamentos de laboratórios, coletas padronizadas, poluição atmosférica e mudanças climáticas.', " +
                "'Atua em diversas vertentes, seja na cidade ou no campo. É o responsável por realizar ações que protegem o meio ambiente. Pode trabalhar com inspeções, monitoria de educação ambiental, supervisão de plantios e controle de água, esgoto ou resíduos. Também pode atuar na área de saneamento e recursos hídricos.', " +
                "'Técnico modular com duração de três semestres e Técnico Integrado ao Ensino Médio.', " +
                "'http://www.portal.cps.sp.gov.br/cursos/etec/meio-ambiente.asp')");
        db.execSQL("insert into Curso (idCurso, nomeCurso, descCurso, profissionalCurso, tipoCurso, linkCurso) values " +
                "(35, " +
                "'Multimídia', " +
                "'Desenvolve comunicação visual em meios eletrônicos, organiza e prepara arquivos digitais que podem compor leiaute para sistemas de comunicação de diferentes finalidades. Aplica técnicas de tratamento de imagens estáticas e em movimento que complementam estruturas de navegação em mídias digitais.  Executa atualização de sites, portais e páginas da web. Elabora textos técnicos de acordo com os fundamentos e com a terminologia da área profissional.', " +
                "'O mercado de trabalho do TÉCNICO EM MULTIMÍDIA é amplo, abrange diversas áreas da comunicação audiovisual, como cinema digital, TV interativa, vídeo e animação. Atua na concepção de roteiros, desenhos de produção, edição e efeitos especiais em empresas de comunicação - rádio e televisão - novas mídias e espaços alternativos de interação social, lazer e cultura. Poderá desenvolver trabalhos em portais de Internet, produtoras de multimídia, escritórios de criação publicitária e de comunicação, editoras de jornais e revistas on-line.', " +
                "'', " +
                "'http://www.portal.cps.sp.gov.br/cursos/etec/multimidia.asp')");
        db.execSQL("insert into Curso (idCurso, nomeCurso, descCurso, profissionalCurso, tipoCurso, linkCurso) values "+
                "(36, " +
                "'Museologia', " +
                "'As principais disciplinas do curso são história, arte e biologia. O aluno aprenderá a fazer a gestão do acervo de um museu, assim como organizar arquivos e documentações. Outro ponto importante é a conservação e a análise da integridade de objetos históricos e práticas de laboratório para entender os processos de deterioração.', " +
                "'É responsável pelo processo de conservação de objetos históricos. Realiza pesquisas e faz análises da integridade das peças do museu.  Cria um histórico do objeto, incluindo questões ambientais em que o objeto foi retirado. Atua como gestor de acervos e documentos.', " +
                "'Técnico com duração de três semestres', " +
                "'http://www.portal.cps.sp.gov.br/cursos/etec/museologia.asp')");
        db.execSQL("insert into Curso (idCurso, nomeCurso, descCurso, profissionalCurso, tipoCurso, linkCurso) values "+
                "(37, " +
                "'Nutrição e Dietética', " +
                "'O aluno aprenderá sobre os tipos de alimentos, o corpo humano e seu funcionamento. Estudará técnicas para orientar as pessoas com uma alimentação equilibrada de acordo com os diferentes biotipos e rotinas. O curso tem base na química e na biologia, para compreender a ação das calorias fornecidas pelos alimentos no organismo e seu processo de metabolismo no corpo humano, e matemática, para cálculos no desenvolvimento de cardápios. O estudante também terá noções de gestão de pessoas para aprender a liderar equipes.', " +
                "'Trabalha com orientação alimentar para manter ou restabelecer o equilíbrio nutricional no tratamento de uma pessoa. Pode supervisionar a higienização de alimentos e administrar processos de controle de qualidade. Também pode atuar com o fornecimento de comidas em festas e eventos, na área de gestão de equipes e na criação de cardápios.', " +
                "'Técnico modular com duração de três semestres e Técnico Integrado ao Ensino Médio.', " +
                "'http://www.portal.cps.sp.gov.br/cursos/etec/nutricao-e-dietetica.asp')");
        db.execSQL("insert into Curso (idCurso, nomeCurso, descCurso, profissionalCurso, tipoCurso, linkCurso) values "+
                "(38, " +
                "'Organização Esportiva', "+
                "'O TÉCNICO EM ORGANIZAÇÃO ESPORTIVA é o profissional que desenvolve e organiza programas de atividades físicas e esportivas, desde a captação e otimização de recursos financeiros, materiais e humanos, a realização de eventos e atividades rotineiras até a disseminação da prática da atividade física e do esporte na sociedade. Planeja espaços e a utilização de equipamentos, de acordo com a atividade ou evento. Identifica necessidades e potencialidades da área esportiva. Presta atendimento ao público e a empresas e instituições. Trabalha em equipe e proativamente, respeitando os princípios da ética profissional, das relações humanas e ambientais, sob a supervisão de um profissional de nível superior de Educação Física.'," +
                "'Setor Público: centros esportivos, centros de treinamento específicos, parques públicos, eventos esportivos, academia ao ar livre, pistas de caminhada, ciclovias, projetos e programas esportivos de âmbito público; Setor Privado: parques temáticos, colônias de férias e acampamentos, clubes, escolas de esporte, eventos, projetos e programas esportivos de âmbito privado, federações esportivas; Terceiro Setor: organizações não governamentais (associações comunitárias, de funcionários, estudantis, entre outros).', "+
                "'',"+
                "'http://www.portal.cps.sp.gov.br/cursos/etec/esportes-e-atividade-fisica.asp')");
        db.execSQL("insert into Curso (idCurso, nomeCurso, descCurso, profissionalCurso, tipoCurso, linkCurso) values "+
                "(39, " +
                "'Orientação Comunitária', "+
                "'As principais disciplinas do curso são Sociologia e Filosofia. Outras matérias importantes são a Geografia, para mapear as comunidades presentes em cada território; e a Matemática, para estruturar dados estatísticos de desenvolvimento social. O aluno aprenderá a criar ações para as comunidades e a se relacionar com populações vulneráveis.', " +
                "'Elabora planejamentos, capta recursos e executa projetos sociais em comunidades.', " +
                "'Técnico modular com duração de dois semestres.',"+
                "'http://www.portal.cps.sp.gov.br/cursos/etec/orientacao-comunitaria.asp')");
        db.execSQL("insert into Curso (idCurso, nomeCurso, descCurso, profissionalCurso, tipoCurso, linkCurso) values "+
                "(40, " +
                "'Paisagismo', " +
                "'O Técnico em Paisagismo é o profissional que executa e gerencia projetos paisagísticos; orienta a conservação de paisagens residenciais e urbanas; propaga espécies e variedades, define técnicas e local de produção de flores e plantas ornamentais. Supervisiona a produção, a colheita e a armazenagem. Implanta infra-estruturas e comercializa a produção, visando à viabilidade econômica do empreendimento, com base nas normas de segurança e de proteção ao meio ambiente.', " +
                "'Escritórios de design, escritórios de projetos de arquitetura e de paisagismo, empresas de jardinagem, produção e comercialização de plantas ornamentais e construtoras e imobiliárias.', " +
                "'', " +
                "'http://www.portal.cps.sp.gov.br/cursos/etec/paisagismo.asp')");
        db.execSQL("insert into Curso (idCurso, nomeCurso, descCurso, profissionalCurso, tipoCurso, linkCurso) values "+
                "(41, " +
                "'Processos Fotográficos', " +
                "'O Técnico em Processos Fotográficos é o profissional que produz e gerencia imagens fotográficas, manipulando a linguagem de forma criativa. Utiliza os recursos tecnológicos de produção em estúdio, executando o tratamento, a edição e o gerenciamento de imagens digitais. Utiliza os equipamentos respeitando as técnicas de iluminação para captura de imagens. Prepara imagens digitais para impressão. Manipula acervos fotográficos. Atua na comercialização, na assistência técnica e na manutenção de equipamentos fotográficos e insumos.', " +
                "'Agências, estúdios fotográficos, lojas de equipamentos e serviços fotográficos, editoras, jornais, laboratórios fotográficos digitais, assistência técnica, como funcionário ou profissional autônomo.', " +
                "'', " +
                "'http://www.portal.cps.sp.gov.br/cursos/etec/processos-fotograficos.asp')");
        db.execSQL("insert into Curso (idCurso, nomeCurso, descCurso, profissionalCurso, tipoCurso, linkCurso) values "+
                "(42, " +
                "'Produção de Áudio e Vídeo',"+
                "'Áreas da comunicação audiovisual, empresas de comunicação, provedores de internet, produtoras independentes, estúdios de gravação, escritórios de criação publicitária e laboratórios de desenvolvimento e pesquisa em comunicação audiovisual.', " +
                "'O mercado de trabalho do TÉCNICO EM PRODUÇÃO DE ÁUDIO E VÍDEO é amplo, abrange diversas áreas da comunicação audiovisual, como cinema digital, TV interativa, vídeo e animação. Atua na concepção de roteiros, desenhos de produção, edição e efeitos especiais em empresas de comunicação - rádio e televisão - novas mídias e espaços alternativos de interação social, lazer e cultura. Poderá desenvolver trabalhos em provedores de Internet, produtoras independentes, estúdios de gravação, escritórios de criação publicitária e de comunicação, empresas de radiodifusão e telecomunicações., além de laboratórios de desenvolvimento e pesquisa em comunicação audiovisual.', " +
                "'', " +
                "'http://www.portal.cps.sp.gov.br/cursos/etec/producao-de-audio-e-video.asp')");
        db.execSQL("insert into Curso (idCurso, nomeCurso, descCurso, profissionalCurso, tipoCurso, linkCurso) values "+
                "(43, " +
                "'Química', " +
                "'A matemática é utilizada para a base de cálculos. A físico-química também é uma disciplina importante no curso. O aluno aprenderá a manipular instrumentos como microscópio, balança analítica e outros equipamentos voltados a análises químicas. Outro ponto importante é o entendimento sobre a tecnologia de processos industriais, onde os alunos aprendem a transformação química e a evolução da matéria-prima até o produto final.', " +
                "'Pode atuar em diversas áreas como analista ou supervisor de processos. Ele analisa a qualidade e a pureza da matéria-prima que chega na empresa. Também pode desenvolver produtos e trabalhar com controle de qualidade nos processos químicos.', " +
                "'Técnico com duração de quatro semestres e Técnico Integrado ao Ensino Médio', " +
                "'http://www.portal.cps.sp.gov.br/cursos/etec/quimica.asp')");
        db.execSQL("insert into Curso (idCurso, nomeCurso, descCurso, profissionalCurso, tipoCurso, linkCurso) values "+
                "(44, " +
                "'Recursos Humanos', " +
                "'O estudante vai precisar de conhecimentos de língua portuguesa, matemática e história para compreender o curso e aprender a realizar as tarefas sob a responsabilidade do setor de Recursos Humanos de uma empresa, como contratação, demissão e aposentadoria de funcionários e oferta de benefícios (vale-transporte, plano de saúde, vale-refeição etc.), entre outras atividades. Por isso, será importante também estudar as leis que regulam os direitos e deveres do empregador e dos empregados (legislação trabalhista). O estudante vai aprender ainda noções de psicologia para entender como as pessoas se relacionam no ambiente de trabalho, realizar processos de recrutamento e seleção de novos funcionários e promover ações de motivação', " +
                "'Anuncia vagas de emprego, descrevendo as atribuições do cargo a ser preenchido; aplica testes em processos seletivos; realiza cálculos para determinar os valores que serão descontados no salário dos funcionários, como o Imposto de Renda e a contribuição ao INSS, além de porcentagem referente a benefícios, como vale-transporte, plano de saúde etc.; insere informações no sistema para a geração de demonstrativos de pagamentos (holerites ou contracheques); cuida da documentação necessária para aposentadoria, contratação e demissão de profissionais, inclusive preenchendo informações na carteira de trabalho; organiza e arquiva documentos do setor; registra e controla período de férias e afastamento de funcionários; e auxilia no treinamento e capacitação dos empregados.', " +
                "'Técnico com duração de três semestres, Ensino Médio com Habilitação Técnica Profissional e Ensino Médio com Qualificação Profissional.', " +
                "'http://www.portal.cps.sp.gov.br/cursos/etec/recursos-humanos.asp')");
        db.execSQL("insert into Curso (idCurso, nomeCurso, descCurso, profissionalCurso, tipoCurso, linkCurso) values "+
                "(45, " +
                "'Redes de Computadores', "+
                "'O aluno vai aprender a conectar computadores em rede, de modo que as máquinas compartilhem recursos como arquivos, internet, contas de e-mail e impressoras. O estudante vai conhecer os sistemas operacionais utilizados pelas redes e seus padrões de comunicação e as configurações de segurança da informação. Aprenderá como controlar o tráfego de dados, fazer cópias de segurança, programar a automação de tarefas e montar o cabeamento estruturado, que conecta os computadores aos servidores e armários de telecomunicações. Conhecimentos de matemática e física serão revisados ao longo do curso para o aprendizado de cálculo com números binários, eletrônica, propagação de ondas eletromagnéticas e óticas.', "+
                "'Instala e configura computadores e equipamentos de informática em rede. É responsável também por administrar, manter e analisar redes de computadores. O técnico instala ainda sistemas operacionais para os servidores que gerenciam as redes e configura o compartilhamento de recursos e as permissões de segurança entre as máquinas e os usuários. Além disso, o profissional monta os cabos e os armários de telecomunicações que abrigam servidores e outros equipamentos para rede; cuida da documentação, listando os dispositivos utilizados e executa projetos de implantação de redes de computadores em empresas.', "+
                "'Técnico com duração de três semestres.'," +
                "'http://www.portal.cps.sp.gov.br/cursos/etec/redes-de-computadores.asp')");
        db.execSQL("insert into Curso (idCurso, nomeCurso, descCurso, profissionalCurso, tipoCurso, linkCurso) values "+
                "(46, " +
                "'Regência', " +
                "'O TÉCNICO EM REGÊNCIA é o profissional que atua na direção musical de grupos vocais e instrumentais, conduzindo a execução de obras musicais para grupo de instrumentos ou de vozes, ao vivo ou em estúdios de gravação. Ensina e ensaia grupos instrumentais e/ou vocais. Elabora textos técnicos, de acordo com os fundamentos e com a terminologia da área profissional. Organiza eventos musicais em geral. Trabalha com gêneros e estilos musicais e técnicas de regência musical.', " +
                "'Corais. Conjuntos de música popular e folclórica. Grupos de câmara. Estúdios de gravação.Rádio, televisão, multimídia e espaços alternativos de interação social, lazer e cultura.', " +
                "'', " +
                "'http://www.portal.cps.sp.gov.br/cursos/etec/regencia.asp')");
        db.execSQL("insert into Curso (idCurso, nomeCurso, descCurso, profissionalCurso, tipoCurso, linkCurso) values "+
                "(47, " +
                "'Secretariado',"+
                "'O estudante vai aprender noções de administração, para compreender o funcionamento das empresas, e reforçar conhecimentos de língua portuguesa e inglês, para a redação de documentos técnicos e administrativos. O aluno estudará ainda sobre os tipos de documentos utilizados em uma empresa e maneiras de organizar e arquivar cada um. Completam a formação o estudo de técnicas de atendimento ao cliente, planejamento de eventos (como reuniões, simpósios etc.), e informática.', " +
                "'É responsável por assessorar os dirigentes de uma empresa. As atividades mais comuns são: organizar a agenda de compromissos, o que inclui marcar ou cancelar reuniões, por exemplo; planejar e organizar eventos, como almoço de negócios; elaborar orçamentos de serviços, como reserva de passagens aéreas e diárias de hotel; receber, conferir, encaminhar e arquivar documentos, registrando a sua movimentação em livros de protocolos ou em programas de computador; acompanhar os prazos de cada documento recebido e colher as assinaturas necessárias; redigir documentos, como comunicados, correspondências, ofícios, memorandos, informativos e atas; cadastrar fornecedores e clientes; e elaborar apresentações, planilhas e relatórios.', " +
                "'Técnico com duração de três semestres, Técnico integrado ao Ensino Médio, Técnico a distância (online e semipresencial) e Ensino Médio com Habilitação Técnica Profissional.', " +
                "'http://www.portal.cps.sp.gov.br/cursos/etec/secretariado.asp')");
        db.execSQL("insert into Curso (idCurso, nomeCurso, descCurso, profissionalCurso, tipoCurso, linkCurso) values "+
                "(48, " +
                "'Segurança do Trabalho', " +
                "'Técnicas para prevenir doenças e acidentes de trabalho são o foco do curso. Além do português para interpretar leis e as normas obrigatórias no ambiente de trabalho, o estudante aprenderá física para estudar o ruído e a vibração das ferramentas e equipamentos utilizados pelos funcionários da empresa. A matemática para a avaliação dos riscos ambientais também é uma disciplina básica para a compreensão do curso. O aluno vai aprender primeiros socorros e combate a incêndio.', " +
                "'O profissional atua na identificação de riscos presentes nos ambientes de trabalho, estuda a aplicação das normas obrigatórias e propõe soluções para a prevenção de acidentes. O técnico também ajuda no treinamento dos funcionários em relação à segurança no trabalho. É responsável por selecionar os equipamentos de proteção de acordo com a necessidade de cada funcionário.', " +
                "'Técnico com duração de três semestres e Técnico Integrado ao Ensino Médio.', " +
                "'http://www.portal.cps.sp.gov.br/cursos/etec/seguranca-do-trabalho.asp')");
        db.execSQL("insert into Curso (idCurso, nomeCurso, descCurso, profissionalCurso, tipoCurso, linkCurso) values "+
                "(49, " +
                "'Serviços Jurídicos', " +
                "'Como o foco do curso está nas leis e normas, o aluno vai estudar as áreas do Direito. Vai aprender sobre a Constituição Federal (direito constitucional), a punição aos crimes (direito penal), as regras para relações e disputas entre as pessoas e também as normas para disputas e questões familiares (direito civil), o funcionamento dos órgãos públicos (direito administrativo), as regras para os negócios entre empresas e pessoas (direito empresarial), como deve ser a relação entre patrão e empregado, considerando direitos e deveres de cada um (direito do trabalho), cobrança de tributos, como os impostos (direito tributário) e a proteção garantida aos consumidores (direito do consumidor), entre outros assuntos. O estudante vai conhecer também como são elaborados e redigidos os processos, contratos e documentos jurídicos. Além de aprender sobre as leis, o aluno vai estudar conceitos de administração de empresas, matemática financeira, técnicas de atendimento ao cliente e inglês instrumental. A língua portuguesa é fundamental.', " +
                "'Auxilia o advogado e oferece apoio técnico e administrativo a empresas. Presta atendimento ao público; verifica os prazos de cada etapa de um processo judicial; calcula valores dos honorários dos advogados e dos custos de um processo; recebe e envia documentos, registrando a movimentação em sistemas ou livros de protocolo; redige contratos, ofícios, processos e cartas comerciais e arquiva processos, entre outras atividades.', " +
                "'Técnico com duração de três semestres, Técnico integrado ao Ensino Médio e Ensino Médio com Habilitação Técnica Profissional. ', " +
                "'http://www.portal.cps.sp.gov.br/cursos/etec/servicos-juridicos.asp')");
        db.execSQL("insert into Curso (idCurso, nomeCurso, descCurso, profissionalCurso, tipoCurso, linkCurso) values "+
                "(50, " +
                "'Serviços Públicos', " +
                "'No curso, serão abordados geografia, história, sociologia e língua portuguesa. O aluno aprenderá sobre o sistema político brasileiro, isto é, a forma como o governo é organizado e quais são as atribuições de suas três esferas (federal, estadual e municipal) e dos três poderes – Executivo (são os prefeitos, governadores e presidente, que têm a atribuição de governar o povo), Legislativo (são os vereadores, deputados e senadores, responsáveis por criar as leis) e Judiciário (formado pelos juízes, que interpretam as leis e fiscalizam seu cumprimento). O aluno vai estudar também a Constituição Federal (direito constitucional), a cobrança de tributos, como os impostos (direito tributário) e as leis que regulam os processos licitatórios – procedimentos para a contratação de serviços e a aquisição de produtos. O curso aborda ainda organização das finanças públicas, noções de planejamento para a administração pública e técnicas para analisar e arquivar documentos.', " +
                "'Em instituições públicas, auxilia o gestor em diferentes atividades, como atendimento ao público; elaboração de orçamentos, relatórios e planilhas; redação de projetos; acompanhamento de políticas públicas, incluindo a análise de resultados das ações implementadas; envio de publicações para os veículos oficiais; organização e arquivamento de documentos etc. No setor privado, o técnico pode auxiliar na participação das empresas em processos licitatórios públicos, verificando as exigências dos editais e separando a documentação necessária para a concorrência, por exemplo. No terceiro setor, o profissional pode atuar na preparação de relatórios e na prestação de contas, entre outras tarefas.', " +
                "'Técnico com duração de três semestres e Ensino Médio com Habilitação Técnica Profissional. ', " +
                "'http://www.portal.cps.sp.gov.br/cursos/etec/servicos-publicos.asp')");
        db.execSQL("insert into Curso (idCurso, nomeCurso, descCurso, profissionalCurso, tipoCurso, linkCurso) values "+
                "(51, " +
                "'Teatro', " +
                "'O técnico em Teatro é o profissional que realiza e apoia atividades ligadas à criação em teatro, podendo atuar como ator, radioator, dublador, bonequeiro, contrarregra, assistente de palco, assistente de produção e arte-educador em espaços não formais. Emprega métodos, técnicas e recursos de improvisação, atuação, preparação vocal e corporal em espaços culturais.', " +
                "'Instituições de difusão cultural e artística, teatros, estúdios de rádio, cinema e televisão, instituições recreativas e em escolas de arte teatral, dando aulas de aperfeiçoamento, especialização ou atualização, ou ainda, como dublador em rádio, cinema e televisão; pode também atuar como produtor.', " +
                "'', " +
                "'http://www.portal.cps.sp.gov.br/cursos/etec/teatro.asp')");
        db.execSQL("insert into Curso (idCurso, nomeCurso, descCurso, profissionalCurso, tipoCurso, linkCurso) values "+
                "(52, " +
                "'Telecomunicações', " +
                "'Eletrônica e Informática são as bases do curso técnico em Telecomunicações. Para a compreensão desses assuntos, o estudante vai rever conceitos de matemática para o aprendizado de computação e de física sobre eletricidade e ondas eletromagnéticas. Entre os temas de Informática que serão estudados estão linguagem de programação e instalação e configuração de sistemas operacionais e de redes de comunicação, inclusive a conexão de dispositivos eletrônicos utilizados no dia a dia à internet. Essa conexão é uma revolução tecnológica chamada de internet das coisas. Outras novas tecnologias, como TV Digital, 4G e 5G, também serão abordadas ao longo do curso.', " +
                "'É responsável pela instalação, operação e manutenção de sistemas de telecomunicações para a transmissão de voz, sons, imagens e/ou dados por telefone, rádio, televisão, computador e celular, tanto via cabos de cobre ou de fibra ótica, quanto sem fio. O técnico cuida dos equipamentos de infraestrutura desses sistemas, como antenas e cabos, por exemplo. O profissional é capaz de verificar o sinal de transmissão dos dados, identificar falhas no funcionamento de equipamentos de telecomunicações e efetuar a substituição dos itens com problemas. O técnico pode atuar também na realização de testes do sistema e dos equipamentos utilizados para telecomunicações.', " +
                "'Técnico com duração de três semestres.', " +
                "'http://www.portal.cps.sp.gov.br/cursos/etec/telecomunicacoes.asp')");
        db.execSQL("insert into Curso (idCurso, nomeCurso, descCurso, profissionalCurso, tipoCurso, linkCurso) values "+
                "(53, " +
                "'Transações Imobiliárias', " +
                "'O estudante vai aprender sobre compra, venda e aluguel de imóveis (terrenos, apartamentos, casas e prédios comerciais ou residenciais e salas comerciais). Para compreender os assuntos do curso, o aluno vai precisar de conhecimentos de língua portuguesa, geografia e matemática. Estudará a legislação sobre comercialização de imóveis e os detalhes dos contratos de compra, venda e locação. Vai estudar matemática financeira e ter noções de contabilidade para calcular custos como impostos e tributos sobre as negociações. Um pouco de economia ajudará a avaliar o potencial de comercialização de imóveis de acordo com o lugar, época do ano e a situação econômica do país. Além disso, vai estudar quais são os procedimentos de vistoria dos imóveis – se está em bom estado, se tem problemas, se as condições estão descritas no contrato etc. Conhecimentos sobre construção de imóveis também serão vistos ao longo do curso, como métodos e materiais mais utilizados.', " +
                "'Como corretor, atende clientes interessados em alugar, comprar ou vender imóveis; pesquisa e sugere propriedades de acordo com as preferências do cliente; analisa a documentação de compra e venda, como certidões que informam sobre as dívidas e laudos que caracterizam as condições dos imóveis e visita propriedades a fim de determinar os valores para aluguel e venda. O técnico também pode realizar serviços administrativos em uma imobiliária, como calcular comissões obtidas por meio da venda de um imóvel, verificar os tributos e impostos cobrados a cada negociação, providenciar contratos e calcular operações de financiamento, entre outras atividades.', " +
                "'Técnico com duração de três semestres.', " +
                "'http://www.portal.cps.sp.gov.br/cursos/etec/transacoes-imobiliarias.asp')");
    }


    @Override
    public void onUpgrade(SQLiteDatabase db, int oldVersion, int newVersion) {
        db.execSQL("DROP TABLE IF EXISTS Unidade");
        db.execSQL("DROP TABLE IF EXISTS Curso");
        this.onCreate(db);
    }


    // MÉTODO PARA ADICIONAR UMA ETEC (não usado)

    public void addEtec(EtecBean etec) {

        SQLiteDatabase db = this.getWritableDatabase();

        ContentValues values = new ContentValues();
        values.put("nomeEtec", etec.getNome());
        values.put("cursoEtec", etec.getCurso());
        values.put("etimEtec", etec.getEtim());
        values.put("enderecoEtec", etec.getEndereco());
        values.put("siteEtec", etec.getSite());
        values.put("telEtec", etec.getTelefone());

        db.insert("Unidade", null, values);
        db.close();
    }

    // MÉTODO PARA ADICIONAR UM CURSO (não usado)

    public void addCurso(EtecBean curso) {

        SQLiteDatabase db = this.getWritableDatabase();

        ContentValues values = new ContentValues();
        values.put("nomeCurso", curso.getNomeCurso());
        values.put("linkCurso", curso.getLinkCurso());
        values.put("descCurso", curso.getDescCurso());
        values.put("profissionalCurso", curso.getProfissionalCurso());
        values.put("tipoCurso", curso.getTipoCurso());

        db.insert("Curso", null, values);
        db.close();
    }

    // MÉTODO PARA BUSCAR TODAS AS ETECS

    public ArrayList<EtecBean> getAllEtec() {
        ArrayList<EtecBean> listaEtec = new ArrayList<EtecBean>();
        String query = "SELECT * FROM Unidade";
        SQLiteDatabase db = this.getReadableDatabase();
        Cursor cursor = db.rawQuery(query, null);

        while (cursor.moveToNext()) {
            EtecBean etec = new EtecBean();
            etec.setId(cursor.getInt(cursor.getColumnIndex("idEtec")));
            etec.setNome(cursor.getString(cursor.getColumnIndex("nomeEtec")));
            etec.setCurso(cursor.getString(cursor.getColumnIndex("cursoEtec")));
            etec.setEtim(cursor.getString(cursor.getColumnIndex("etimEtec")));
            etec.setEndereco(cursor.getString(cursor.getColumnIndex("enderecoEtec")));
            etec.setSite(cursor.getString(cursor.getColumnIndex("siteEtec")));
            etec.setTelefone(cursor.getString(cursor.getColumnIndex("telEtec")));
            listaEtec.add(etec);
        }
        cursor.close();
        return listaEtec;
    }

    // MÉTODO PARA BUSCAR TODOS OS CURSOS

    public ArrayList<EtecBean> getAllCursos() {
        ArrayList<EtecBean> listaCursos = new ArrayList<EtecBean>();
        String query = "SELECT * FROM Curso";
        SQLiteDatabase db = this.getReadableDatabase();
        Cursor cursor = db.rawQuery(query, null);

        while (cursor.moveToNext()) {
            EtecBean etec = new EtecBean();
            etec.setId(cursor.getInt(cursor.getColumnIndex("idCurso")));
            etec.setNomeCurso(cursor.getString(cursor.getColumnIndex("nomeCurso")));
            etec.setDescCurso(cursor.getString(cursor.getColumnIndex("descCurso")));
            etec.setProfissionalCurso(cursor.getString(cursor.getColumnIndex("profissionalCurso")));
            etec.setTipoCurso(cursor.getString(cursor.getColumnIndex("tipoCurso")));
            etec.setLinkCurso(cursor.getString(cursor.getColumnIndex("linkCurso")));
            listaCursos.add(etec);
        }
        cursor.close();
        return listaCursos;
    }


    // MÉTODO PARA ATUALIZAÇÃO (não usado)

    public void updateEtec(EtecBean etec) {

        SQLiteDatabase db = this.getWritableDatabase();
        ContentValues values = new ContentValues();

        String[] params = {String.valueOf(etec.getId())};
        db.update("Etec", values, "id = ?", params);
        values.put("nomeEtec", etec.getNome());
        values.put("cursoEtec", etec.getCurso());
        values.put("etimEtec", etec.getEtim());
        values.put("enderecoEtec", etec.getEndereco());
        values.put("siteEtec", etec.getSite());
        values.put("telEtec", etec.getTelefone());

        int i = db.update("Etec", values, "idEtec" + "=?", new String[]{String.valueOf(etec.getId())});

        db.close();

    }


    // MÉTODO PARA DELETAR ETECS (não usado)

    public int deleteEtec(EtecBean etec) {
        SQLiteDatabase db = this.getWritableDatabase();

        int del = db.delete("Etec", "nomeEtec = ?", new String[]{String.valueOf(etec.getNome())});
        db.close();
        return del;
    }

}

