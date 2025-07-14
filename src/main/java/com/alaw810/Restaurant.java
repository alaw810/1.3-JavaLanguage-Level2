package com.alaw810;

public class Restaurant implements Comparable<Restaurant> {
    private String name;
    private int rating;

    public Restaurant(String name, int rating) {
        this.name = name;
        this.rating = rating;
    }

    public String getName() {
        return name;
    }

    public int getRating() {
        return rating;
    }

    @Override
    public String toString() {
        return "Restaurant name: " + name +
                ", rating: " + rating;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj) return true;
        if (obj == null || getClass() != obj.getClass()) return false;
        Restaurant other = (Restaurant) obj;
        return this.rating == other.rating && this.name.equalsIgnoreCase(other.name);
    }

    @Override
    public int hashCode() {
        return name.toLowerCase().hashCode() + Integer.hashCode(rating);
    }

    @Override
    public int compareTo(Restaurant other) {
        int nameComparison = this.name.compareToIgnoreCase(other.name);
        if (nameComparison != 0) {
            return nameComparison;
        }
        return Integer.compare(other.rating, this.rating);
    }

}
