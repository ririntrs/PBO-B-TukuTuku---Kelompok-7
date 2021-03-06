PGDMP                         y            tukutuku    13.2    13.2 ;    ?           0    0    ENCODING    ENCODING        SET client_encoding = 'UTF8';
                      false            ?           0    0 
   STDSTRINGS 
   STDSTRINGS     (   SET standard_conforming_strings = 'on';
                      false            ?           0    0 
   SEARCHPATH 
   SEARCHPATH     8   SELECT pg_catalog.set_config('search_path', '', false);
                      false            ?           1262    26667    tukutuku    DATABASE     h   CREATE DATABASE tukutuku WITH TEMPLATE = template0 ENCODING = 'UTF8' LOCALE = 'English_Indonesia.1252';
    DROP DATABASE tukutuku;
                postgres    false            ?            1259    26706    jenis    TABLE     l   CREATE TABLE public.jenis (
    id_jenis integer NOT NULL,
    nama_jenis character varying(15) NOT NULL
);
    DROP TABLE public.jenis;
       public         heap    postgres    false            ?            1259    26704    jenis_id_jenis_seq    SEQUENCE     ?   CREATE SEQUENCE public.jenis_id_jenis_seq
    AS integer
    START WITH 1
    INCREMENT BY 1
    NO MINVALUE
    NO MAXVALUE
    CACHE 1;
 )   DROP SEQUENCE public.jenis_id_jenis_seq;
       public          postgres    false    203            ?           0    0    jenis_id_jenis_seq    SEQUENCE OWNED BY     I   ALTER SEQUENCE public.jenis_id_jenis_seq OWNED BY public.jenis.id_jenis;
          public          postgres    false    202            ?            1259    26714    merk    TABLE     i   CREATE TABLE public.merk (
    id_merk integer NOT NULL,
    nama_merk character varying(20) NOT NULL
);
    DROP TABLE public.merk;
       public         heap    postgres    false            ?            1259    26712    merk_id_merk_seq    SEQUENCE     ?   CREATE SEQUENCE public.merk_id_merk_seq
    AS integer
    START WITH 1
    INCREMENT BY 1
    NO MINVALUE
    NO MAXVALUE
    CACHE 1;
 '   DROP SEQUENCE public.merk_id_merk_seq;
       public          postgres    false    205            ?           0    0    merk_id_merk_seq    SEQUENCE OWNED BY     E   ALTER SEQUENCE public.merk_id_merk_seq OWNED BY public.merk.id_merk;
          public          postgres    false    204            ?            1259    26670    pegawai    TABLE     ?   CREATE TABLE public.pegawai (
    id integer NOT NULL,
    jenis_kelamin character(2) NOT NULL,
    nama character varying(50) NOT NULL
);
    DROP TABLE public.pegawai;
       public         heap    postgres    false            ?            1259    26668    pegawai_id_seq    SEQUENCE     ?   CREATE SEQUENCE public.pegawai_id_seq
    AS integer
    START WITH 1
    INCREMENT BY 1
    NO MINVALUE
    NO MAXVALUE
    CACHE 1;
 %   DROP SEQUENCE public.pegawai_id_seq;
       public          postgres    false    201            ?           0    0    pegawai_id_seq    SEQUENCE OWNED BY     A   ALTER SEQUENCE public.pegawai_id_seq OWNED BY public.pegawai.id;
          public          postgres    false    200            ?            1259    26857    penjualan_sepatu    TABLE     ?   CREATE TABLE public.penjualan_sepatu (
    id_penjualan_sepatu integer NOT NULL,
    tanggal_barang_terjual character varying(15) NOT NULL,
    harga integer NOT NULL,
    jumlah integer NOT NULL,
    id_sepatu integer
);
 $   DROP TABLE public.penjualan_sepatu;
       public         heap    postgres    false            ?            1259    26855 (   penjualan_sepatu_id_penjualan_sepatu_seq    SEQUENCE     ?   CREATE SEQUENCE public.penjualan_sepatu_id_penjualan_sepatu_seq
    AS integer
    START WITH 1
    INCREMENT BY 1
    NO MINVALUE
    NO MAXVALUE
    CACHE 1;
 ?   DROP SEQUENCE public.penjualan_sepatu_id_penjualan_sepatu_seq;
       public          postgres    false    211            ?           0    0 (   penjualan_sepatu_id_penjualan_sepatu_seq    SEQUENCE OWNED BY     u   ALTER SEQUENCE public.penjualan_sepatu_id_penjualan_sepatu_seq OWNED BY public.penjualan_sepatu.id_penjualan_sepatu;
          public          postgres    false    210            ?            1259    26870    penjualan_tas    TABLE     ?   CREATE TABLE public.penjualan_tas (
    id_penjualan_tas integer NOT NULL,
    tanggal_barang_terjual character varying(15) NOT NULL,
    harga integer NOT NULL,
    jumlah integer NOT NULL,
    id_tas integer
);
 !   DROP TABLE public.penjualan_tas;
       public         heap    postgres    false            ?            1259    26868 "   penjualan_tas_id_penjualan_tas_seq    SEQUENCE     ?   CREATE SEQUENCE public.penjualan_tas_id_penjualan_tas_seq
    AS integer
    START WITH 1
    INCREMENT BY 1
    NO MINVALUE
    NO MAXVALUE
    CACHE 1;
 9   DROP SEQUENCE public.penjualan_tas_id_penjualan_tas_seq;
       public          postgres    false    213            ?           0    0 "   penjualan_tas_id_penjualan_tas_seq    SEQUENCE OWNED BY     i   ALTER SEQUENCE public.penjualan_tas_id_penjualan_tas_seq OWNED BY public.penjualan_tas.id_penjualan_tas;
          public          postgres    false    212            ?            1259    26736    sepatu    TABLE     ?   CREATE TABLE public.sepatu (
    id_sepatu integer NOT NULL,
    ukuran character varying(3) NOT NULL,
    stok integer NOT NULL,
    harga integer NOT NULL,
    id_jenis integer NOT NULL,
    id_merk integer NOT NULL
);
    DROP TABLE public.sepatu;
       public         heap    postgres    false            ?            1259    26734    sepatu_id_sepatu_seq    SEQUENCE     ?   CREATE SEQUENCE public.sepatu_id_sepatu_seq
    AS integer
    START WITH 1
    INCREMENT BY 1
    NO MINVALUE
    NO MAXVALUE
    CACHE 1;
 +   DROP SEQUENCE public.sepatu_id_sepatu_seq;
       public          postgres    false    207            ?           0    0    sepatu_id_sepatu_seq    SEQUENCE OWNED BY     M   ALTER SEQUENCE public.sepatu_id_sepatu_seq OWNED BY public.sepatu.id_sepatu;
          public          postgres    false    206            ?            1259    26755    tas    TABLE     ?   CREATE TABLE public.tas (
    id_tas integer NOT NULL,
    warna character varying(20) NOT NULL,
    stok integer NOT NULL,
    harga integer NOT NULL,
    id_jenis integer NOT NULL,
    id_merk integer NOT NULL
);
    DROP TABLE public.tas;
       public         heap    postgres    false            ?            1259    26753    tas_id_tas_seq    SEQUENCE     ?   CREATE SEQUENCE public.tas_id_tas_seq
    AS integer
    START WITH 1
    INCREMENT BY 1
    NO MINVALUE
    NO MAXVALUE
    CACHE 1;
 %   DROP SEQUENCE public.tas_id_tas_seq;
       public          postgres    false    209            ?           0    0    tas_id_tas_seq    SEQUENCE OWNED BY     A   ALTER SEQUENCE public.tas_id_tas_seq OWNED BY public.tas.id_tas;
          public          postgres    false    208            G           2604    26709    jenis id_jenis    DEFAULT     p   ALTER TABLE ONLY public.jenis ALTER COLUMN id_jenis SET DEFAULT nextval('public.jenis_id_jenis_seq'::regclass);
 =   ALTER TABLE public.jenis ALTER COLUMN id_jenis DROP DEFAULT;
       public          postgres    false    203    202    203            H           2604    26717    merk id_merk    DEFAULT     l   ALTER TABLE ONLY public.merk ALTER COLUMN id_merk SET DEFAULT nextval('public.merk_id_merk_seq'::regclass);
 ;   ALTER TABLE public.merk ALTER COLUMN id_merk DROP DEFAULT;
       public          postgres    false    204    205    205            F           2604    26673 
   pegawai id    DEFAULT     h   ALTER TABLE ONLY public.pegawai ALTER COLUMN id SET DEFAULT nextval('public.pegawai_id_seq'::regclass);
 9   ALTER TABLE public.pegawai ALTER COLUMN id DROP DEFAULT;
       public          postgres    false    200    201    201            K           2604    26860 $   penjualan_sepatu id_penjualan_sepatu    DEFAULT     ?   ALTER TABLE ONLY public.penjualan_sepatu ALTER COLUMN id_penjualan_sepatu SET DEFAULT nextval('public.penjualan_sepatu_id_penjualan_sepatu_seq'::regclass);
 S   ALTER TABLE public.penjualan_sepatu ALTER COLUMN id_penjualan_sepatu DROP DEFAULT;
       public          postgres    false    211    210    211            L           2604    26873    penjualan_tas id_penjualan_tas    DEFAULT     ?   ALTER TABLE ONLY public.penjualan_tas ALTER COLUMN id_penjualan_tas SET DEFAULT nextval('public.penjualan_tas_id_penjualan_tas_seq'::regclass);
 M   ALTER TABLE public.penjualan_tas ALTER COLUMN id_penjualan_tas DROP DEFAULT;
       public          postgres    false    213    212    213            I           2604    26739    sepatu id_sepatu    DEFAULT     t   ALTER TABLE ONLY public.sepatu ALTER COLUMN id_sepatu SET DEFAULT nextval('public.sepatu_id_sepatu_seq'::regclass);
 ?   ALTER TABLE public.sepatu ALTER COLUMN id_sepatu DROP DEFAULT;
       public          postgres    false    207    206    207            J           2604    26758 
   tas id_tas    DEFAULT     h   ALTER TABLE ONLY public.tas ALTER COLUMN id_tas SET DEFAULT nextval('public.tas_id_tas_seq'::regclass);
 9   ALTER TABLE public.tas ALTER COLUMN id_tas DROP DEFAULT;
       public          postgres    false    209    208    209            ?          0    26706    jenis 
   TABLE DATA           5   COPY public.jenis (id_jenis, nama_jenis) FROM stdin;
    public          postgres    false    203   |B       ?          0    26714    merk 
   TABLE DATA           2   COPY public.merk (id_merk, nama_merk) FROM stdin;
    public          postgres    false    205   ?B       ?          0    26670    pegawai 
   TABLE DATA           :   COPY public.pegawai (id, jenis_kelamin, nama) FROM stdin;
    public          postgres    false    201   aC       ?          0    26857    penjualan_sepatu 
   TABLE DATA           q   COPY public.penjualan_sepatu (id_penjualan_sepatu, tanggal_barang_terjual, harga, jumlah, id_sepatu) FROM stdin;
    public          postgres    false    211   ?C       ?          0    26870    penjualan_tas 
   TABLE DATA           h   COPY public.penjualan_tas (id_penjualan_tas, tanggal_barang_terjual, harga, jumlah, id_tas) FROM stdin;
    public          postgres    false    213   ?C       ?          0    26736    sepatu 
   TABLE DATA           S   COPY public.sepatu (id_sepatu, ukuran, stok, harga, id_jenis, id_merk) FROM stdin;
    public          postgres    false    207   SD       ?          0    26755    tas 
   TABLE DATA           L   COPY public.tas (id_tas, warna, stok, harga, id_jenis, id_merk) FROM stdin;
    public          postgres    false    209   E       ?           0    0    jenis_id_jenis_seq    SEQUENCE SET     A   SELECT pg_catalog.setval('public.jenis_id_jenis_seq', 10, true);
          public          postgres    false    202            ?           0    0    merk_id_merk_seq    SEQUENCE SET     >   SELECT pg_catalog.setval('public.merk_id_merk_seq', 8, true);
          public          postgres    false    204                        0    0    pegawai_id_seq    SEQUENCE SET     <   SELECT pg_catalog.setval('public.pegawai_id_seq', 1, true);
          public          postgres    false    200                       0    0 (   penjualan_sepatu_id_penjualan_sepatu_seq    SEQUENCE SET     W   SELECT pg_catalog.setval('public.penjualan_sepatu_id_penjualan_sepatu_seq', 10, true);
          public          postgres    false    210                       0    0 "   penjualan_tas_id_penjualan_tas_seq    SEQUENCE SET     P   SELECT pg_catalog.setval('public.penjualan_tas_id_penjualan_tas_seq', 7, true);
          public          postgres    false    212                       0    0    sepatu_id_sepatu_seq    SEQUENCE SET     C   SELECT pg_catalog.setval('public.sepatu_id_sepatu_seq', 1, false);
          public          postgres    false    206                       0    0    tas_id_tas_seq    SEQUENCE SET     =   SELECT pg_catalog.setval('public.tas_id_tas_seq', 1, false);
          public          postgres    false    208            P           2606    26711    jenis jenis_pkey 
   CONSTRAINT     T   ALTER TABLE ONLY public.jenis
    ADD CONSTRAINT jenis_pkey PRIMARY KEY (id_jenis);
 :   ALTER TABLE ONLY public.jenis DROP CONSTRAINT jenis_pkey;
       public            postgres    false    203            R           2606    26719    merk merk_pkey 
   CONSTRAINT     Q   ALTER TABLE ONLY public.merk
    ADD CONSTRAINT merk_pkey PRIMARY KEY (id_merk);
 8   ALTER TABLE ONLY public.merk DROP CONSTRAINT merk_pkey;
       public            postgres    false    205            N           2606    26675    pegawai pegawai_pkey 
   CONSTRAINT     R   ALTER TABLE ONLY public.pegawai
    ADD CONSTRAINT pegawai_pkey PRIMARY KEY (id);
 >   ALTER TABLE ONLY public.pegawai DROP CONSTRAINT pegawai_pkey;
       public            postgres    false    201            X           2606    26862 &   penjualan_sepatu penjualan_sepatu_pkey 
   CONSTRAINT     u   ALTER TABLE ONLY public.penjualan_sepatu
    ADD CONSTRAINT penjualan_sepatu_pkey PRIMARY KEY (id_penjualan_sepatu);
 P   ALTER TABLE ONLY public.penjualan_sepatu DROP CONSTRAINT penjualan_sepatu_pkey;
       public            postgres    false    211            Z           2606    26875     penjualan_tas penjualan_tas_pkey 
   CONSTRAINT     l   ALTER TABLE ONLY public.penjualan_tas
    ADD CONSTRAINT penjualan_tas_pkey PRIMARY KEY (id_penjualan_tas);
 J   ALTER TABLE ONLY public.penjualan_tas DROP CONSTRAINT penjualan_tas_pkey;
       public            postgres    false    213            T           2606    26741    sepatu sepatu_pkey 
   CONSTRAINT     W   ALTER TABLE ONLY public.sepatu
    ADD CONSTRAINT sepatu_pkey PRIMARY KEY (id_sepatu);
 <   ALTER TABLE ONLY public.sepatu DROP CONSTRAINT sepatu_pkey;
       public            postgres    false    207            V           2606    26760    tas tas_pkey 
   CONSTRAINT     N   ALTER TABLE ONLY public.tas
    ADD CONSTRAINT tas_pkey PRIMARY KEY (id_tas);
 6   ALTER TABLE ONLY public.tas DROP CONSTRAINT tas_pkey;
       public            postgres    false    209            [           2606    26742    sepatu fk_jenis    FK CONSTRAINT     u   ALTER TABLE ONLY public.sepatu
    ADD CONSTRAINT fk_jenis FOREIGN KEY (id_jenis) REFERENCES public.jenis(id_jenis);
 9   ALTER TABLE ONLY public.sepatu DROP CONSTRAINT fk_jenis;
       public          postgres    false    2896    203    207            ]           2606    26761    tas fk_jenis    FK CONSTRAINT     r   ALTER TABLE ONLY public.tas
    ADD CONSTRAINT fk_jenis FOREIGN KEY (id_jenis) REFERENCES public.jenis(id_jenis);
 6   ALTER TABLE ONLY public.tas DROP CONSTRAINT fk_jenis;
       public          postgres    false    2896    209    203            \           2606    26748    sepatu fk_merk    FK CONSTRAINT     q   ALTER TABLE ONLY public.sepatu
    ADD CONSTRAINT fk_merk FOREIGN KEY (id_merk) REFERENCES public.merk(id_merk);
 8   ALTER TABLE ONLY public.sepatu DROP CONSTRAINT fk_merk;
       public          postgres    false    2898    205    207            ^           2606    26766    tas fk_merk    FK CONSTRAINT     n   ALTER TABLE ONLY public.tas
    ADD CONSTRAINT fk_merk FOREIGN KEY (id_merk) REFERENCES public.merk(id_merk);
 5   ALTER TABLE ONLY public.tas DROP CONSTRAINT fk_merk;
       public          postgres    false    209    205    2898            _           2606    26863    penjualan_sepatu fk_sepatu    FK CONSTRAINT     ?   ALTER TABLE ONLY public.penjualan_sepatu
    ADD CONSTRAINT fk_sepatu FOREIGN KEY (id_sepatu) REFERENCES public.sepatu(id_sepatu);
 D   ALTER TABLE ONLY public.penjualan_sepatu DROP CONSTRAINT fk_sepatu;
       public          postgres    false    211    2900    207            `           2606    26876    penjualan_tas fk_tas    FK CONSTRAINT     t   ALTER TABLE ONLY public.penjualan_tas
    ADD CONSTRAINT fk_tas FOREIGN KEY (id_tas) REFERENCES public.tas(id_tas);
 >   ALTER TABLE ONLY public.penjualan_tas DROP CONSTRAINT fk_tas;
       public          postgres    false    213    2902    209            ?   j   x??K
?@??{??	?h?]@?9B6nZ????s???j???u?p5Y?5ip?QsY?!?g1ЫZ???Ds5???zi?RxF/??`???-???3?_??      ?   [   x?3??N,?O??2?tN,*???2?JMM???2????K??T???M?IL??2?t?LO-?2?t?ɬJLJ-??2?t?L?
Z ?er??qqq J??      ?      x?3?P?t?,)?Tp?K?KI?????? Ha?      ?   T   x?m?K?0???a,C?ֻx?s???????$On.???????g?q?? ?u?񧱭?m?+s_3????????F??      ?   O   x?]̻?0C???<;_va?9?D??#?
?$%??z?C????゙??????????;??=?v???l^?=?<      ?   ?   x?U???0kr??_K?!?ܸ??s?%QE?=?b8??@(0(
|
?B?
o??\I[???
???Ǫ?~k-??M4?z???(b8VL?7b?\X?-A??r-?U?H
?,??@J??A?	zY?{Z??*??j?5?.????3?y???o鶾/D?x9?      ?   ?   x?m???1D??_?H'3I'GaAO"xZ؋??Î??2oGcfW?-??zEM???1\??G??yHb?U???QK=??8???d?~???>wm?]P1l,	??Y?(?h??P?61bu?????eU??+Mt?1p????y?nQ??ǢV/ۢn3?󸘚ݸ΍^?uӞw?Tm???8}??܄?}Pj??K???b<7Y~???M\?     