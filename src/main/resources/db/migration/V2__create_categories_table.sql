CREATE TABLE metadata_category_type (
    id      BIGINT          AUTO_INCREMENT PRIMARY KEY,
    name    VARCHAR(255)    NOT NULL UNIQUE
);

CREATE TABLE categories (
    id                  BIGINT          AUTO_INCREMENT PRIMARY KEY,
    name                VARCHAR(255)    NOT NULL,
    category_type_id    BIGINT          NOT NULL,
    FOREIGN KEY (category_type_id) REFERENCES metadata_category_type(id)
);