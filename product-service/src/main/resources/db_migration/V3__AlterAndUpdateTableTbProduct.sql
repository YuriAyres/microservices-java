ALTER TABLE tb_product ADD COLUMN image_url VARCHAR(255);

UPDATE tb_product SET image_url = '';

UPDATE tb_product
    SET image_url = 'https://yt3.googleusercontent.com/ffmaWekcCD_HuA0XK30n2YZ4gqxKOUEEfFWXmEYmqL6coFU6OlQTrkVFy2OpFCXmv2xOBhK0SA=s900-c-k-c0x00ffffff-no-rj'
    WHERE description = 'iPhone 15 128GB';