/**
 * This class is generated by jOOQ
 */
package com.performancecarerx.persistence.tables.records;


import com.performancecarerx.persistence.tables.RatioProfileValues;

import javax.annotation.Generated;

import org.jooq.Field;
import org.jooq.Record1;
import org.jooq.Record4;
import org.jooq.Row4;
import org.jooq.impl.UpdatableRecordImpl;


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
public class RatioProfileValuesRecord extends UpdatableRecordImpl<RatioProfileValuesRecord> implements Record4<Integer, Integer, Integer, Double> {

    private static final long serialVersionUID = 71097271;

    /**
     * Setter for <code>public.ratio_profile_values.id</code>.
     */
    public void setId(Integer value) {
        set(0, value);
    }

    /**
     * Getter for <code>public.ratio_profile_values.id</code>.
     */
    public Integer getId() {
        return (Integer) get(0);
    }

    /**
     * Setter for <code>public.ratio_profile_values.ratio_profile_id</code>.
     */
    public void setRatioProfileId(Integer value) {
        set(1, value);
    }

    /**
     * Getter for <code>public.ratio_profile_values.ratio_profile_id</code>.
     */
    public Integer getRatioProfileId() {
        return (Integer) get(1);
    }

    /**
     * Setter for <code>public.ratio_profile_values.reps</code>.
     */
    public void setReps(Integer value) {
        set(2, value);
    }

    /**
     * Getter for <code>public.ratio_profile_values.reps</code>.
     */
    public Integer getReps() {
        return (Integer) get(2);
    }

    /**
     * Setter for <code>public.ratio_profile_values.multiplier</code>.
     */
    public void setMultiplier(Double value) {
        set(3, value);
    }

    /**
     * Getter for <code>public.ratio_profile_values.multiplier</code>.
     */
    public Double getMultiplier() {
        return (Double) get(3);
    }

    // -------------------------------------------------------------------------
    // Primary key information
    // -------------------------------------------------------------------------

    /**
     * {@inheritDoc}
     */
    @Override
    public Record1<Integer> key() {
        return (Record1) super.key();
    }

    // -------------------------------------------------------------------------
    // Record4 type implementation
    // -------------------------------------------------------------------------

    /**
     * {@inheritDoc}
     */
    @Override
    public Row4<Integer, Integer, Integer, Double> fieldsRow() {
        return (Row4) super.fieldsRow();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Row4<Integer, Integer, Integer, Double> valuesRow() {
        return (Row4) super.valuesRow();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<Integer> field1() {
        return RatioProfileValues.RATIO_PROFILE_VALUES.ID;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<Integer> field2() {
        return RatioProfileValues.RATIO_PROFILE_VALUES.RATIO_PROFILE_ID;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<Integer> field3() {
        return RatioProfileValues.RATIO_PROFILE_VALUES.REPS;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<Double> field4() {
        return RatioProfileValues.RATIO_PROFILE_VALUES.MULTIPLIER;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Integer value1() {
        return getId();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Integer value2() {
        return getRatioProfileId();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Integer value3() {
        return getReps();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Double value4() {
        return getMultiplier();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public RatioProfileValuesRecord value1(Integer value) {
        setId(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public RatioProfileValuesRecord value2(Integer value) {
        setRatioProfileId(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public RatioProfileValuesRecord value3(Integer value) {
        setReps(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public RatioProfileValuesRecord value4(Double value) {
        setMultiplier(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public RatioProfileValuesRecord values(Integer value1, Integer value2, Integer value3, Double value4) {
        value1(value1);
        value2(value2);
        value3(value3);
        value4(value4);
        return this;
    }

    // -------------------------------------------------------------------------
    // Constructors
    // -------------------------------------------------------------------------

    /**
     * Create a detached RatioProfileValuesRecord
     */
    public RatioProfileValuesRecord() {
        super(RatioProfileValues.RATIO_PROFILE_VALUES);
    }

    /**
     * Create a detached, initialised RatioProfileValuesRecord
     */
    public RatioProfileValuesRecord(Integer id, Integer ratioProfileId, Integer reps, Double multiplier) {
        super(RatioProfileValues.RATIO_PROFILE_VALUES);

        set(0, id);
        set(1, ratioProfileId);
        set(2, reps);
        set(3, multiplier);
    }
}