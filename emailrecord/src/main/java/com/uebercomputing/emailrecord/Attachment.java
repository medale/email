/**
 * Autogenerated by Avro
 * 
 * DO NOT EDIT DIRECTLY
 */
package com.uebercomputing.emailrecord;  
@SuppressWarnings("all")
@org.apache.avro.specific.AvroGenerated
public class Attachment extends org.apache.avro.specific.SpecificRecordBase implements org.apache.avro.specific.SpecificRecord {
  public static final org.apache.avro.Schema SCHEMA$ = new org.apache.avro.Schema.Parser().parse("{\"type\":\"record\",\"name\":\"Attachment\",\"namespace\":\"com.uebercomputing.emailrecord\",\"fields\":[{\"name\":\"fileName\",\"type\":{\"type\":\"string\",\"avro.java.string\":\"String\"}},{\"name\":\"size\",\"type\":\"int\"},{\"name\":\"mimeType\",\"type\":{\"type\":\"string\",\"avro.java.string\":\"String\"}},{\"name\":\"data\",\"type\":\"bytes\"}]}");
  public static org.apache.avro.Schema getClassSchema() { return SCHEMA$; }
  @Deprecated public java.lang.String fileName;
  @Deprecated public int size;
  @Deprecated public java.lang.String mimeType;
  @Deprecated public java.nio.ByteBuffer data;

  /**
   * Default constructor.  Note that this does not initialize fields
   * to their default values from the schema.  If that is desired then
   * one should use <code>newBuilder()</code>. 
   */
  public Attachment() {}

  /**
   * All-args constructor.
   */
  public Attachment(java.lang.String fileName, java.lang.Integer size, java.lang.String mimeType, java.nio.ByteBuffer data) {
    this.fileName = fileName;
    this.size = size;
    this.mimeType = mimeType;
    this.data = data;
  }

  public org.apache.avro.Schema getSchema() { return SCHEMA$; }
  // Used by DatumWriter.  Applications should not call. 
  public java.lang.Object get(int field$) {
    switch (field$) {
    case 0: return fileName;
    case 1: return size;
    case 2: return mimeType;
    case 3: return data;
    default: throw new org.apache.avro.AvroRuntimeException("Bad index");
    }
  }
  // Used by DatumReader.  Applications should not call. 
  @SuppressWarnings(value="unchecked")
  public void put(int field$, java.lang.Object value$) {
    switch (field$) {
    case 0: fileName = (java.lang.String)value$; break;
    case 1: size = (java.lang.Integer)value$; break;
    case 2: mimeType = (java.lang.String)value$; break;
    case 3: data = (java.nio.ByteBuffer)value$; break;
    default: throw new org.apache.avro.AvroRuntimeException("Bad index");
    }
  }

  /**
   * Gets the value of the 'fileName' field.
   */
  public java.lang.String getFileName() {
    return fileName;
  }

  /**
   * Sets the value of the 'fileName' field.
   * @param value the value to set.
   */
  public void setFileName(java.lang.String value) {
    this.fileName = value;
  }

  /**
   * Gets the value of the 'size' field.
   */
  public java.lang.Integer getSize() {
    return size;
  }

  /**
   * Sets the value of the 'size' field.
   * @param value the value to set.
   */
  public void setSize(java.lang.Integer value) {
    this.size = value;
  }

  /**
   * Gets the value of the 'mimeType' field.
   */
  public java.lang.String getMimeType() {
    return mimeType;
  }

  /**
   * Sets the value of the 'mimeType' field.
   * @param value the value to set.
   */
  public void setMimeType(java.lang.String value) {
    this.mimeType = value;
  }

  /**
   * Gets the value of the 'data' field.
   */
  public java.nio.ByteBuffer getData() {
    return data;
  }

  /**
   * Sets the value of the 'data' field.
   * @param value the value to set.
   */
  public void setData(java.nio.ByteBuffer value) {
    this.data = value;
  }

  /** Creates a new Attachment RecordBuilder */
  public static com.uebercomputing.emailrecord.Attachment.Builder newBuilder() {
    return new com.uebercomputing.emailrecord.Attachment.Builder();
  }
  
  /** Creates a new Attachment RecordBuilder by copying an existing Builder */
  public static com.uebercomputing.emailrecord.Attachment.Builder newBuilder(com.uebercomputing.emailrecord.Attachment.Builder other) {
    return new com.uebercomputing.emailrecord.Attachment.Builder(other);
  }
  
  /** Creates a new Attachment RecordBuilder by copying an existing Attachment instance */
  public static com.uebercomputing.emailrecord.Attachment.Builder newBuilder(com.uebercomputing.emailrecord.Attachment other) {
    return new com.uebercomputing.emailrecord.Attachment.Builder(other);
  }
  
  /**
   * RecordBuilder for Attachment instances.
   */
  public static class Builder extends org.apache.avro.specific.SpecificRecordBuilderBase<Attachment>
    implements org.apache.avro.data.RecordBuilder<Attachment> {

    private java.lang.String fileName;
    private int size;
    private java.lang.String mimeType;
    private java.nio.ByteBuffer data;

    /** Creates a new Builder */
    private Builder() {
      super(com.uebercomputing.emailrecord.Attachment.SCHEMA$);
    }
    
    /** Creates a Builder by copying an existing Builder */
    private Builder(com.uebercomputing.emailrecord.Attachment.Builder other) {
      super(other);
      if (isValidValue(fields()[0], other.fileName)) {
        this.fileName = data().deepCopy(fields()[0].schema(), other.fileName);
        fieldSetFlags()[0] = true;
      }
      if (isValidValue(fields()[1], other.size)) {
        this.size = data().deepCopy(fields()[1].schema(), other.size);
        fieldSetFlags()[1] = true;
      }
      if (isValidValue(fields()[2], other.mimeType)) {
        this.mimeType = data().deepCopy(fields()[2].schema(), other.mimeType);
        fieldSetFlags()[2] = true;
      }
      if (isValidValue(fields()[3], other.data)) {
        this.data = data().deepCopy(fields()[3].schema(), other.data);
        fieldSetFlags()[3] = true;
      }
    }
    
    /** Creates a Builder by copying an existing Attachment instance */
    private Builder(com.uebercomputing.emailrecord.Attachment other) {
            super(com.uebercomputing.emailrecord.Attachment.SCHEMA$);
      if (isValidValue(fields()[0], other.fileName)) {
        this.fileName = data().deepCopy(fields()[0].schema(), other.fileName);
        fieldSetFlags()[0] = true;
      }
      if (isValidValue(fields()[1], other.size)) {
        this.size = data().deepCopy(fields()[1].schema(), other.size);
        fieldSetFlags()[1] = true;
      }
      if (isValidValue(fields()[2], other.mimeType)) {
        this.mimeType = data().deepCopy(fields()[2].schema(), other.mimeType);
        fieldSetFlags()[2] = true;
      }
      if (isValidValue(fields()[3], other.data)) {
        this.data = data().deepCopy(fields()[3].schema(), other.data);
        fieldSetFlags()[3] = true;
      }
    }

    /** Gets the value of the 'fileName' field */
    public java.lang.String getFileName() {
      return fileName;
    }
    
    /** Sets the value of the 'fileName' field */
    public com.uebercomputing.emailrecord.Attachment.Builder setFileName(java.lang.String value) {
      validate(fields()[0], value);
      this.fileName = value;
      fieldSetFlags()[0] = true;
      return this; 
    }
    
    /** Checks whether the 'fileName' field has been set */
    public boolean hasFileName() {
      return fieldSetFlags()[0];
    }
    
    /** Clears the value of the 'fileName' field */
    public com.uebercomputing.emailrecord.Attachment.Builder clearFileName() {
      fileName = null;
      fieldSetFlags()[0] = false;
      return this;
    }

    /** Gets the value of the 'size' field */
    public java.lang.Integer getSize() {
      return size;
    }
    
    /** Sets the value of the 'size' field */
    public com.uebercomputing.emailrecord.Attachment.Builder setSize(int value) {
      validate(fields()[1], value);
      this.size = value;
      fieldSetFlags()[1] = true;
      return this; 
    }
    
    /** Checks whether the 'size' field has been set */
    public boolean hasSize() {
      return fieldSetFlags()[1];
    }
    
    /** Clears the value of the 'size' field */
    public com.uebercomputing.emailrecord.Attachment.Builder clearSize() {
      fieldSetFlags()[1] = false;
      return this;
    }

    /** Gets the value of the 'mimeType' field */
    public java.lang.String getMimeType() {
      return mimeType;
    }
    
    /** Sets the value of the 'mimeType' field */
    public com.uebercomputing.emailrecord.Attachment.Builder setMimeType(java.lang.String value) {
      validate(fields()[2], value);
      this.mimeType = value;
      fieldSetFlags()[2] = true;
      return this; 
    }
    
    /** Checks whether the 'mimeType' field has been set */
    public boolean hasMimeType() {
      return fieldSetFlags()[2];
    }
    
    /** Clears the value of the 'mimeType' field */
    public com.uebercomputing.emailrecord.Attachment.Builder clearMimeType() {
      mimeType = null;
      fieldSetFlags()[2] = false;
      return this;
    }

    /** Gets the value of the 'data' field */
    public java.nio.ByteBuffer getData() {
      return data;
    }
    
    /** Sets the value of the 'data' field */
    public com.uebercomputing.emailrecord.Attachment.Builder setData(java.nio.ByteBuffer value) {
      validate(fields()[3], value);
      this.data = value;
      fieldSetFlags()[3] = true;
      return this; 
    }
    
    /** Checks whether the 'data' field has been set */
    public boolean hasData() {
      return fieldSetFlags()[3];
    }
    
    /** Clears the value of the 'data' field */
    public com.uebercomputing.emailrecord.Attachment.Builder clearData() {
      data = null;
      fieldSetFlags()[3] = false;
      return this;
    }

    @Override
    public Attachment build() {
      try {
        Attachment record = new Attachment();
        record.fileName = fieldSetFlags()[0] ? this.fileName : (java.lang.String) defaultValue(fields()[0]);
        record.size = fieldSetFlags()[1] ? this.size : (java.lang.Integer) defaultValue(fields()[1]);
        record.mimeType = fieldSetFlags()[2] ? this.mimeType : (java.lang.String) defaultValue(fields()[2]);
        record.data = fieldSetFlags()[3] ? this.data : (java.nio.ByteBuffer) defaultValue(fields()[3]);
        return record;
      } catch (Exception e) {
        throw new org.apache.avro.AvroRuntimeException(e);
      }
    }
  }
}
