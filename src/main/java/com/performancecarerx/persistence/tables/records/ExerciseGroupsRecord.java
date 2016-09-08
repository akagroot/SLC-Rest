/**
 * This class is generated by jOOQ
 */
package com.performancecarerx.persistence.tables.records;


import com.performancecarerx.persistence.tables.ExerciseGroups;

import javax.annotation.Generated;

import org.jooq.Field;
import org.jooq.Record1;
import org.jooq.Record2;
import org.jooq.Row2;
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
public class ExerciseGroupsRecord extends UpdatableRecordImpl<ExerciseGroupsRecord> implements Record2<String, String> {

    private static final long serialVersionUID = -212771262;

    /**
     * Setter for <code>public.exercise_groups.key_name</code>.
     */
    public void setKeyName(String value) {
        set(0, value);
    }

    /**
     * Getter for <code>public.exercise_groups.key_name</code>.
     */
    public String getKeyName() {
        return (String) get(0);
    }

    /**
     * Setter for <code>public.exercise_groups.display_name</code>.
     */
    public void setDisplayName(String value) {
        set(1, value);
    }

    /**
     * Getter for <code>public.exercise_groups.display_name</code>.
     */
    public String getDisplayName() {
        return (String) get(1);
    }

    // -------------------------------------------------------------------------
    // Primary key information
    // -------------------------------------------------------------------------

    /**
     * {@inheritDoc}
     */
    @Override
    public Record1<String> key() {
        return (Record1) super.key();
    }

    // -------------------------------------------------------------------------
    // Record2 type implementation
    // -------------------------------------------------------------------------

    /**
     * {@inheritDoc}
     */
    @Override
    public Row2<String, String> fieldsRow() {
        return (Row2) super.fieldsRow();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Row2<String, String> valuesRow() {
        return (Row2) super.valuesRow();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<String> field1() {
        return ExerciseGroups.EXERCISE_GROUPS.KEY_NAME;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<String> field2() {
        return ExerciseGroups.EXERCISE_GROUPS.DISPLAY_NAME;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public String value1() {
        return getKeyName();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public String value2() {
        return getDisplayName();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public ExerciseGroupsRecord value1(String value) {
        setKeyName(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public ExerciseGroupsRecord value2(String value) {
        setDisplayName(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public ExerciseGroupsRecord values(String value1, String value2) {
        value1(value1);
        value2(value2);
        return this;
    }

    // -------------------------------------------------------------------------
    // Constructors
    // -------------------------------------------------------------------------

    /**
     * Create a detached ExerciseGroupsRecord
     */
    public ExerciseGroupsRecord() {
        super(ExerciseGroups.EXERCISE_GROUPS);
    }

    /**
     * Create a detached, initialised ExerciseGroupsRecord
     */
    public ExerciseGroupsRecord(String keyName, String displayName) {
        super(ExerciseGroups.EXERCISE_GROUPS);

        set(0, keyName);
        set(1, displayName);
    }
}
