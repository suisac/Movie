package dev.suyeta.movie;

import org.bson.types.ObjectId;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import java.util.*;

@Service
public class MovieService {
    @Autowired
    private MovieRepository movieRepository;
    public List<movie> allMovies(){
        return movieRepository.findAll();
    }

    public Optional<movie> singleMovie(String imdbId){
        return movieRepository.findMovieByImdbId(imdbId);
    }
}
