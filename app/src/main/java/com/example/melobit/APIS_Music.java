package com.example.melobit;


import com.example.melobit.ArtistInfo_M;
import com.example.melobit.Lyrics_M;
import com.example.melobit.MusicInfo_M;
import com.example.melobit.Search_M;


import io.reactivex.Observable;
import retrofit2.http.GET;
import retrofit2.http.Path;

public interface APIS_Music {

    @GET("song/new/0/11")
    Observable<MusicInfo_M> getNewSongs();

    @GET("artist/trending/0/4")
    Observable<ArtistInfo_M> getTopSingers();

    @GET("song/top/day/0/100")
    Observable<MusicInfo_M> getTopSongDay();

    @GET("song/top/week/0/100")
    Observable<MusicInfo_M> getTopSongWeek();

    @GET("search/query/{text}/0/50")
    Observable<Search_M> searchAS(@Path("text") String text);

    @GET("song/{song_id}")
    Observable<Lyrics_M> getLyrics(@Path("song_id") String song_id);


}
