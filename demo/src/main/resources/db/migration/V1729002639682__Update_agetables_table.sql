-- Add foreign key constraint to agetables for name_id referencing testtables id
ALTER TABLE agetables
ADD COLUMN name_id BIGINT,
ADD CONSTRAINT fk_agetables_name_id
FOREIGN KEY (name_id)
REFERENCES testtables(id);