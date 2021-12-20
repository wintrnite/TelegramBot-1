package model;

import java.util.Objects;

/**
 * Сущность блюда.
 */
public class Dish
{
    private final String title;
    private Recipe recipe;
    private String imageUrl;
    private String summary;

    public Dish(String title)
    {
        this.title = title;
    }

    public Dish(String title, Recipe recipe, String imageUrl, String summery)
    {
        this.title = title;
        this.recipe = recipe;
        this.imageUrl = imageUrl;
        this.summary = summery;
    }

    public Recipe getRecipe()
    {
        return recipe;
    }

    public Dish setRecipe(Recipe recipe)
    {
        this.recipe = recipe;
        return this;
    }

    public String getImageUrl()
    {
        return imageUrl;
    }


    public Dish setImageUrl(String imageUrl)
    {
        this.imageUrl = imageUrl;
        return this;
    }

    public String getSummary()
    {
        return summary;
    }

    public Dish setSummary(String summary)
    {
        this.summary = summary;
        return this;
    }

    public String getTitle()
    {
        return title;
    }


    @Override
    public boolean equals(Object o)
    {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Dish dish = (Dish) o;
        return Objects.equals(title, dish.title) && Objects.equals(recipe, dish.recipe);
    }

    @Override
    public int hashCode()
    {
        return Objects.hash(title, recipe);
    }

    @Override
    public String toString()
    {
        return "Dish{" +
                "title='" + title + '\'' +
                ", recipe=" + recipe +
                '}';
    }
}
