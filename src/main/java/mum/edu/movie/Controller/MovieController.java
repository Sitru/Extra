package mum.edu.movie.Controller;

import java.util.List;

import javax.annotation.Resource;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import mum.edu.movie.Model.Movie;
import mum.edu.movie.Service.MovieService;



@Controller
public class MovieController {

	
	@Resource
	MovieService movieservice; 
	
	public MovieService getMovieservice() {
		return movieservice;
	}
	public void setMovieservice(MovieService movieservice) {
		this.movieservice = movieservice;
	}
	@RequestMapping(value="/")
	public String redirect(){
		return "home";
	}
	@RequestMapping(value="/home" ,method = RequestMethod.GET)
	public String home(){
		return "MovieHome";
	}
	@RequestMapping(value="/addingmovie" , method= RequestMethod.POST)
	public String addingmovie(int id,String title ,int rating,int year,String summary){
		
		movieservice.createMovie(id,title ,rating,year,summary);
		
		   
		         return "redirect:/MovieHome";
	}
	
	@RequestMapping(value="/MovieHome", method=RequestMethod.GET)
	public String movies(Model model){
		
		
		List<Movie> movies=(List<Movie>) movieservice.getAllMovie();
		
		//model.addAttribute("posts", postService.getAllPost());
		model.addAttribute("movies", movies);
		System.out.println("returned ");
		return "MovieHome";
	}
	/*
	@RequestMapping(value="/index" ,method = RequestMethod.GET)
	public String index(){
		return "index";
	}
	
	@RequestMapping(value="/index", method=RequestMethod.POST)
	public String bytitle(String title){
		if(searching.gettitle(title).equals(title))
		    return "redirect:/Movielist";
		
		return "MovieHome";
	}
	@RequestMapping(value="/index", method=RequestMethod.POST)
	public String bygenere(String genere){
		if(searching.gettitle(genere).equals(genere))
		    return "redirect:/Movielist";
		
		return "MovieHome";
	}
	*/
}
