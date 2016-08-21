/**
 * This class is generated by jOOQ
 */
package com.performancecarerx.persistence.tables;


import com.performancecarerx.persistence.Keys;
import com.performancecarerx.persistence.PerformancecarerxDb;
import com.performancecarerx.persistence.tables.records.RatioProfileValuesRecord;

import java.util.Arrays;
import java.util.List;

import javax.annotation.Generated;

import org.jooq.Field;
import org.jooq.ForeignKey;
import org.jooq.Identity;
import org.jooq.Schema;
import org.jooq.Table;
import org.jooq.TableField;
import org.jooq.UniqueKey;
import org.jooq.impl.TableImpl;


/**
 * This class is generated by jOOQ.
 */
@Generated(
    value = {
        "http://www.jooq.org",
        "jOOQ version:3.8.3"
    },
    comments = "This class is generated by jOOQ"
)
@SuppressWarnings({ "all", "unchecked", "rawtypes" })
public class RatioProfileValues extends TableImpl<RatioProfileValuesRecord> {

    private static final long serialVersionUID = 634854902;

    /**
     * The reference instance of <code>performancecarerx_db.ratio_profile_values</code>
     */
    public static final RatioProfileValues RATIO_PROFILE_VALUES = new RatioProfileValues();

    /**
     * The class holding records for this type
     */
    @Override
    public Class<RatioProfileValuesRecord> getRecordType() {
        return RatioProfileValuesRecord.class;
    }

    /**
     * The column <code>performancecarerx_db.ratio_profile_values.id</code>.
     */
    public final TableField<RatioProfileValuesRecord, Integer> ID = createField("id", org.jooq.impl.SQLDataType.INTEGER.nullable(false), this, "");

    /**
     * The column <code>performancecarerx_db.ratio_profile_values.ratio_profile_id</code>.
     */
    public final TableField<RatioProfileValuesRecord, Integer> RATIO_PROFILE_ID = createField("ratio_profile_id", org.jooq.impl.SQLDataType.INTEGER.nullable(false), this, "");

    /**
     * The column <code>performancecarerx_db.ratio_profile_values.reps</code>.
     */
    public final TableField<RatioProfileValuesRecord, Integer> REPS = createField("reps", org.jooq.impl.SQLDataType.INTEGER.nullable(false), this, "");

    /**
     * The column <code>performancecarerx_db.ratio_profile_values.multiplier</code>.
     */
    public final TableField<RatioProfileValuesRecord, Double> MULTIPLIER = createField("multiplier", org.jooq.impl.SQLDataType.FLOAT.nullable(false), this, "");

    /**
     * Create a <code>performancecarerx_db.ratio_profile_values</code> table reference
     */
    public RatioProfileValues() {
        this("ratio_profile_values", null);
    }

    /**
     * Create an aliased <code>performancecarerx_db.ratio_profile_values</code> table reference
     */
    public RatioProfileValues(String alias) {
        this(alias, RATIO_PROFILE_VALUES);
    }

    private RatioProfileValues(String alias, Table<RatioProfileValuesRecord> aliased) {
        this(alias, aliased, null);
    }

    private RatioProfileValues(String alias, Table<RatioProfileValuesRecord> aliased, Field<?>[] parameters) {
        super(alias, null, aliased, parameters, "");
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Schema getSchema() {
        return PerformancecarerxDb.PERFORMANCECARERX_DB;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Identity<RatioProfileValuesRecord, Integer> getIdentity() {
        return Keys.IDENTITY_RATIO_PROFILE_VALUES;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public UniqueKey<RatioProfileValuesRecord> getPrimaryKey() {
        return Keys.KEY_RATIO_PROFILE_VALUES_PRIMARY;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public List<UniqueKey<RatioProfileValuesRecord>> getKeys() {
        return Arrays.<UniqueKey<RatioProfileValuesRecord>>asList(Keys.KEY_RATIO_PROFILE_VALUES_PRIMARY);
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public List<ForeignKey<RatioProfileValuesRecord, ?>> getReferences() {
        return Arrays.<ForeignKey<RatioProfileValuesRecord, ?>>asList(Keys.FK_RATIOPROFILEVALUE_RATIOPROFILEID);
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public RatioProfileValues as(String alias) {
        return new RatioProfileValues(alias, this);
    }

    /**
     * Rename this table
     */
    public RatioProfileValues rename(String name) {
        return new RatioProfileValues(name, null);
    }
}
