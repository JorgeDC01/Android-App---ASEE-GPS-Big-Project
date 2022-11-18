package com.example.proyecto.Room;

import android.content.Context;

import androidx.room.Database;
import androidx.room.Room;
import androidx.room.RoomDatabase;

import com.example.proyecto.Room.DAO.EventoDAO;
import com.example.proyecto.Room.Modelo.Evento;


@Database(entities = {Evento.class}, version = 3, exportSchema = false)
public abstract class AppDatabase extends RoomDatabase {
    private static AppDatabase appDataBase;
    private static Context contexto;

    public abstract EventoDAO eventoDAO();

    protected AppDatabase(){
    }

    public static AppDatabase getInstance(Context context){
        if (appDataBase == null) {
            appDataBase = Room.databaseBuilder(context.getApplicationContext(),
                    AppDatabase.class, "database.db").fallbackToDestructiveMigration().build();
        }
        return appDataBase;
    }
}
