/*
* Copyright (C) 2022 The Evolution X Project
*
* This program is free software: you can redistribute it and/or modify
* it under the terms of the GNU General Public License as published by
* the Free Software Foundation, either version 2 of the License, or
* (at your option) any later version.
*
* This program is distributed in the hope that it will be useful,
* but WITHOUT ANY WARRANTY; without even the implied warranty of
* MERCHANTABILITY or FITNESS FOR A PARTICULAR PURPOSE. See the
* GNU General Public License for more details.
*
* You should have received a copy of the GNU General Public License
* along with this program. If not, see <http://www.gnu.org/licenses/>.
*
*/
package org.evolution.oplus.OPlusExtras.kcal;

import android.content.Context;
import android.content.res.Resources;
import android.content.SharedPreferences;

import android.os.Bundle;

import androidx.preference.Preference;
import androidx.preference.PreferenceCategory;
import androidx.preference.PreferenceFragment;
import androidx.preference.PreferenceGroup;
import androidx.preference.PreferenceManager;

import org.evolution.oplus.OPlusExtras.preferences.RedPreference;
import org.evolution.oplus.OPlusExtras.preferences.GreenPreference;
import org.evolution.oplus.OPlusExtras.preferences.BluePreference;
import org.evolution.oplus.OPlusExtras.preferences.SaturationPreference;
import org.evolution.oplus.OPlusExtras.preferences.HuePreference;
import org.evolution.oplus.OPlusExtras.preferences.ValuePreference;
import org.evolution.oplus.OPlusExtras.preferences.ContrastPreference;
import org.evolution.oplus.OPlusExtras.R;

public class KcalSettings extends PreferenceFragment
        implements Preference.OnPreferenceChangeListener {

    public static final String KEY_RED = "red";
    public static final String KEY_GREEN = "green";
    public static final String KEY_BLUE = "blue";
    public static final String KEY_SATURATION = "saturation";
    public static final String KEY_HUE = "hue";
    public static final String KEY_VALUE = "value";
    public static final String KEY_CONTRAST = "contrast";

    private RedPreference mRed;
    private GreenPreference mGreen;
    private BluePreference mBlue;
    private SaturationPreference mSaturation;
    private HuePreference mHue;
    private ValuePreference mValue;
    private ContrastPreference mContrast;

    @Override
    public void onCreatePreferences(Bundle savedInstanceState, String rootKey) {
        final SharedPreferences prefs = PreferenceManager.getDefaultSharedPreferences(this.getContext());
        addPreferencesFromResource(R.xml.kcal_settings);

        Context context = this.getContext();

            mRed = (RedPreference) findPreference(KEY_RED);
            if (mRed != null) {
                mRed.setEnabled(RedPreference.isSupported(this.getContext()));
            }

            mGreen = (GreenPreference) findPreference(KEY_GREEN);
            if (mGreen != null) {
                mGreen.setEnabled(GreenPreference.isSupported(this.getContext()));
            }

            mBlue = (BluePreference) findPreference(KEY_BLUE);
            if (mBlue != null) {
                mBlue.setEnabled(BluePreference.isSupported(this.getContext()));
            }

            mSaturation = (SaturationPreference) findPreference(KEY_SATURATION);
            if (mSaturation != null) {
                mSaturation.setEnabled(SaturationPreference.isSupported(this.getContext()));
            }

            mHue = (HuePreference) findPreference(KEY_HUE);
            if (mHue != null) {
                mHue.setEnabled(HuePreference.isSupported(this.getContext()));
            }

            mValue = (ValuePreference) findPreference(KEY_VALUE);
            if (mValue != null) {
                mValue.setEnabled(ValuePreference.isSupported(this.getContext()));
            }

            mContrast = (ContrastPreference) findPreference(KEY_CONTRAST);
            if (mContrast != null) {
                mContrast.setEnabled(ContrastPreference.isSupported(this.getContext()));
            }
      }

    @Override
    public boolean onPreferenceChange(Preference preference, Object newValue) {
        return false;
      }
}
