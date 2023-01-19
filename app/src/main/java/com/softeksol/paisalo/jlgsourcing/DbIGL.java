package com.softeksol.paisalo.jlgsourcing;

import android.app.Application;
import android.content.Context;

import com.raizlabs.android.dbflow.annotation.Database;
import com.raizlabs.android.dbflow.annotation.Migration;
import com.raizlabs.android.dbflow.sql.SQLiteType;
import com.raizlabs.android.dbflow.sql.migration.AlterTableMigration;
import com.softeksol.paisalo.jlgsourcing.Utilities.IglPreferences;
import com.softeksol.paisalo.jlgsourcing.activities.ActivityLogin;
import com.softeksol.paisalo.jlgsourcing.entities.Borrower;
import com.softeksol.paisalo.jlgsourcing.entities.BorrowerFamilyExpenses;
import com.softeksol.paisalo.jlgsourcing.entities.BorrowerFamilyLoan;
import com.softeksol.paisalo.jlgsourcing.entities.BorrowerFamilyMember;


/**
 * Created by sachindra on 2016-10-03.
 */


@Database(name = "PAISALO_SRC_DB", version = DbIGL.VERSION)
public class DbIGL {
    //public static final String NAME = BuildConfig.DATABASE_NAME;
   //public static final String NAME = IglPreferences.getPrefString(, SEILIGL.DATABASE_NAME, "");

    public static final int VERSION = 12;

    /*@Migration(version = 5, database = DbIGL.class)
    public static class Migration5 extends AlterTableMigration<Guarantor> {

        public Migration5(Class<Guarantor> table) {
            super(table);
        }

        @Override
        public void onPreMigrate() {
            addColumn(SQLiteType.TEXT, "isAadharVerified");
        }
    }*/

    /*@Migration(version = 5, database = DbIGL.class)
    public static class Migration5 extends AlterTableMigration<Guarantor> {

        public Migration5(Class<Guarantor> table) {
            super(table);
        }

        @Override
        public void onPreMigrate() {
            addColumn(SQLiteType.TEXT, "isAadharVerified");
        }
    }*/
    /*@Migration(version = 6, database = DbIGL.class)
    public static class Migration6 extends AlterTableMigration<Guarantor> {

        public Migration6(Class<Guarantor> table) {
            super(table);
        }

        @Override
        public void onPreMigrate() {
            addColumn(SQLiteType.TEXT, "isAadharVerified");
        }
    }*/
    @Migration(version = 8, database = DbIGL.class)
    public static class Migration8 extends AlterTableMigration<BorrowerFamilyExpenses> {

        public Migration8(Class<BorrowerFamilyExpenses> table) {
            super(table);
        }

        @Override
        public void onPreMigrate() {
            addColumn(SQLiteType.TEXT, "HomeType");
            addColumn(SQLiteType.TEXT, "HomeRoofType");
            addColumn(SQLiteType.TEXT, "ToiletType");
            addColumn(SQLiteType.TEXT, "LivingWSpouse");
        }
    }

    @Migration(version = 9, database = DbIGL.class)
    public static class Migration9 extends AlterTableMigration<Borrower> {

        public Migration9(Class<Borrower> table) {
            super(table);
        }

        @Override
        public void onPreMigrate() {
            addColumn(SQLiteType.TEXT, "isCurrentAddressDifferent");
        }
    }

    @Migration(version = 10, database = DbIGL.class)
    public static class Migration10 extends AlterTableMigration<BorrowerFamilyLoan> {

        public Migration10(Class<BorrowerFamilyLoan> table) {
            super(table);
        }

        @Override
        public void onPreMigrate() {
            addColumn(SQLiteType.INTEGER, "AutoID");
        }
    }

    @Migration(version = 11, database = DbIGL.class)
    public static class Migration11 extends AlterTableMigration<BorrowerFamilyMember> {

        public Migration11(Class<BorrowerFamilyMember> table) {
            super(table);
        }

        @Override
        public void onPreMigrate() {
            addColumn(SQLiteType.INTEGER, "AutoID");
        }
    }

    @Migration(version = 12, database = DbIGL.class)
    public static class Migration12 extends AlterTableMigration<Borrower> {

        public Migration12(Class<Borrower> table) {
            super(table);
        }

        @Override
        public void onPreMigrate() {
            addColumn(SQLiteType.TEXT, "FatherName");
            addColumn(SQLiteType.TEXT, "MotherName");
        }
    }
}
