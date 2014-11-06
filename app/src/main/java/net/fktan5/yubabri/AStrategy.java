package net.fktan5.yubabri;

import android.content.Context;
import android.content.SharedPreferences;

/**
 * Created by keigo on 14/11/07.
 */
public class AStrategy {
    private int mVoyageCount;

    private int mReachBossCount;

    private int mWinBossCount;

    private int mGetSCount;

    public static final String KEY_VC = "voyage_count";
    public static final String KEY_RBC = "reach_boss_count";
    public static final String KEY_WBC = "win_boss_count";
    public static final String KEY_GSC = "get_s_count";

    public static final int MAX_VC = 36;
    public static final int MAX_RBC = 24;
    public static final int MAX_WBC = 12;
    public static final int MAX_GSC = 6;

    public AStrategy(){
        mVoyageCount = 0;
        mReachBossCount = 0;
        mWinBossCount = 0;
        mGetSCount = 0;
    }

    public void countUpVoyageCount(){
        if(mVoyageCount < MAX_VC) {
            mVoyageCount++;
        }
    }

    public void countUpReachBossCount(){
        if(mReachBossCount < MAX_RBC) {
            mReachBossCount++;
        }
    }

    public void countUpWinBossCount(){
        if(mWinBossCount < MAX_WBC) {
            mWinBossCount++;
        }
    }

    public void countUpGetSCount(){
        if(mGetSCount < MAX_GSC) {
            mGetSCount++;
        }
    }

    public void loadFromSharedPrefs(Context context){
        SharedPreferences preferences = context.getSharedPreferences(
                context.getString(R.string.app_name), Context.MODE_PRIVATE);

        mVoyageCount = preferences.getInt(AStrategy.KEY_VC, 0);
        mReachBossCount = preferences.getInt(AStrategy.KEY_RBC, 0);
        mWinBossCount = preferences.getInt(AStrategy.KEY_WBC, 0);
        mGetSCount = preferences.getInt(AStrategy.KEY_GSC, 0);
    }

    public boolean saveToSharedPrefs(Context context){
        SharedPreferences preferences = context.getSharedPreferences(
                context.getString(R.string.app_name), Context.MODE_PRIVATE);

        SharedPreferences.Editor editor = preferences.edit();
        editor.putInt(AStrategy.KEY_VC, mVoyageCount);
        editor.putInt(AStrategy.KEY_RBC, mReachBossCount);
        editor.putInt(AStrategy.KEY_WBC, mWinBossCount);
        editor.putInt(AStrategy.KEY_GSC, mGetSCount);
        return editor.commit();
    }
}
