/*
 * This file is generated by jOOQ.
 */
package org.killbill.billing.plugin.currency.dao.gen.tables;


import java.time.LocalDateTime;
import java.util.Arrays;
import java.util.List;

import org.jooq.Field;
import org.jooq.ForeignKey;
import org.jooq.Identity;
import org.jooq.Index;
import org.jooq.Name;
import org.jooq.Record;
import org.jooq.Row6;
import org.jooq.Schema;
import org.jooq.Table;
import org.jooq.TableField;
import org.jooq.TableOptions;
import org.jooq.UniqueKey;
import org.jooq.impl.DSL;
import org.jooq.impl.SQLDataType;
import org.jooq.impl.TableImpl;
import org.jooq.types.ULong;
import org.killbill.billing.plugin.currency.dao.gen.Indexes;
import org.killbill.billing.plugin.currency.dao.gen.Keys;
import org.killbill.billing.plugin.currency.dao.gen.Killbill;
import org.killbill.billing.plugin.currency.dao.gen.tables.records.CurrencyUpdatesRecord;


/**
 * This class is generated by jOOQ.
 */
@SuppressWarnings({ "all", "unchecked", "rawtypes" })
public class CurrencyUpdates extends TableImpl<CurrencyUpdatesRecord> {

    private static final long serialVersionUID = 1L;

    /**
     * The reference instance of <code>killbill.currency_updates</code>
     */
    public static final CurrencyUpdates CURRENCY_UPDATES = new CurrencyUpdates();

    /**
     * The class holding records for this type
     */
    @Override
    public Class<CurrencyUpdatesRecord> getRecordType() {
        return CurrencyUpdatesRecord.class;
    }

    /**
     * The column <code>killbill.currency_updates.record_id</code>.
     */
    public final TableField<CurrencyUpdatesRecord, ULong> RECORD_ID = createField(DSL.name("record_id"), SQLDataType.BIGINTUNSIGNED.nullable(false).identity(true), this, "");

    /**
     * The column <code>killbill.currency_updates.base_currency</code>.
     */
    public final TableField<CurrencyUpdatesRecord, String> BASE_CURRENCY = createField(DSL.name("base_currency"), SQLDataType.CHAR(3).nullable(false), this, "");

    /**
     * The column <code>killbill.currency_updates.conversion_date</code>.
     */
    public final TableField<CurrencyUpdatesRecord, LocalDateTime> CONVERSION_DATE = createField(DSL.name("conversion_date"), SQLDataType.LOCALDATETIME(0).nullable(false), this, "");

    /**
     * The column <code>killbill.currency_updates.created_at</code>.
     */
    public final TableField<CurrencyUpdatesRecord, LocalDateTime> CREATED_AT = createField(DSL.name("created_at"), SQLDataType.LOCALDATETIME(0).nullable(false), this, "");

    /**
     * The column <code>killbill.currency_updates.updated_at</code>.
     */
    public final TableField<CurrencyUpdatesRecord, LocalDateTime> UPDATED_AT = createField(DSL.name("updated_at"), SQLDataType.LOCALDATETIME(0).nullable(false), this, "");

    /**
     * The column <code>killbill.currency_updates.kb_tenant_id</code>.
     */
    public final TableField<CurrencyUpdatesRecord, String> KB_TENANT_ID = createField(DSL.name("kb_tenant_id"), SQLDataType.CHAR(36).nullable(false), this, "");

    private CurrencyUpdates(Name alias, Table<CurrencyUpdatesRecord> aliased) {
        this(alias, aliased, null);
    }

    private CurrencyUpdates(Name alias, Table<CurrencyUpdatesRecord> aliased, Field<?>[] parameters) {
        super(alias, null, aliased, parameters, DSL.comment(""), TableOptions.table());
    }

    /**
     * Create an aliased <code>killbill.currency_updates</code> table reference
     */
    public CurrencyUpdates(String alias) {
        this(DSL.name(alias), CURRENCY_UPDATES);
    }

    /**
     * Create an aliased <code>killbill.currency_updates</code> table reference
     */
    public CurrencyUpdates(Name alias) {
        this(alias, CURRENCY_UPDATES);
    }

    /**
     * Create a <code>killbill.currency_updates</code> table reference
     */
    public CurrencyUpdates() {
        this(DSL.name("currency_updates"), null);
    }

    public <O extends Record> CurrencyUpdates(Table<O> child, ForeignKey<O, CurrencyUpdatesRecord> key) {
        super(child, key, CURRENCY_UPDATES);
    }

    @Override
    public Schema getSchema() {
        return aliased() ? null : Killbill.KILLBILL;
    }

    @Override
    public List<Index> getIndexes() {
        return Arrays.asList(Indexes.CURRENCY_UPDATES_CURRENCY_UPDATES_BASE_CURRENCY);
    }

    @Override
    public Identity<CurrencyUpdatesRecord, ULong> getIdentity() {
        return (Identity<CurrencyUpdatesRecord, ULong>) super.getIdentity();
    }

    @Override
    public UniqueKey<CurrencyUpdatesRecord> getPrimaryKey() {
        return Keys.KEY_CURRENCY_UPDATES_PRIMARY;
    }

    @Override
    public List<UniqueKey<CurrencyUpdatesRecord>> getUniqueKeys() {
        return Arrays.asList(Keys.KEY_CURRENCY_UPDATES_RECORD_ID);
    }

    @Override
    public CurrencyUpdates as(String alias) {
        return new CurrencyUpdates(DSL.name(alias), this);
    }

    @Override
    public CurrencyUpdates as(Name alias) {
        return new CurrencyUpdates(alias, this);
    }

    /**
     * Rename this table
     */
    @Override
    public CurrencyUpdates rename(String name) {
        return new CurrencyUpdates(DSL.name(name), null);
    }

    /**
     * Rename this table
     */
    @Override
    public CurrencyUpdates rename(Name name) {
        return new CurrencyUpdates(name, null);
    }

    // -------------------------------------------------------------------------
    // Row6 type methods
    // -------------------------------------------------------------------------

    @Override
    public Row6<ULong, String, LocalDateTime, LocalDateTime, LocalDateTime, String> fieldsRow() {
        return (Row6) super.fieldsRow();
    }
}
