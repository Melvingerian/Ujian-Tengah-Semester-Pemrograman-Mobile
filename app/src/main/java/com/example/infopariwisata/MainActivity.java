package com.example.infopariwisata;

import android.os.Bundle;
import android.widget.SearchView;
import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import java.util.ArrayList;
import java.util.List;

public class MainActivity extends AppCompatActivity {

    private RecyclerView recyclerView;
    private TourismAdapter adapter;
    private List<TourismPlace> tourismPlaces;
    private List<TourismPlace> filteredPlaces;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        tourismPlaces = TourismPlace.getSamplePlaces();
        filteredPlaces = new ArrayList<>(tourismPlaces);

        recyclerView = findViewById(R.id.recycler_view);
        recyclerView.setLayoutManager(new LinearLayoutManager(this));

        tourismPlaces = new ArrayList<>();
        tourismPlaces.add(new TourismPlace(R.drawable.image1, "Raja Ampat", "Papua", "Raja Ampat is an archipelago located off the coast of Papua, Indonesia. It is renowned for its stunning natural beauty, featuring more than 1,500 small islands, islets, and cays surrounded by the crystal-clear waters of the Pacific Ocean. The name \"Raja Ampat\" translates to \"Four Kings,\" referring to the four main islands: Waigeo, Misool, Salawati, and Batanta.\n" +
                "\n" +
                "Known for its rich biodiversity, Raja Ampat is often considered one of the best diving destinations in the world. The waters are home to over 1,500 species of fish, 600 species of coral, and various other marine life, making it a paradise for underwater explorers. The islands are also famous for their lush tropical forests, dramatic limestone cliffs, and remote beaches.\n" +
                "\n" +
                "Raja Ampat has a unique cultural heritage, with indigenous Papuan tribes maintaining traditional lifestyles. The region's natural wonders and cultural significance attract tourists, researchers, and conservationists from all over the world. It is a prime example of an ecologically rich and culturally diverse destination that emphasizes sustainability and environmental protection."));
        tourismPlaces.add(new TourismPlace(R.drawable.image2, "Borobudur Temple", "Magelang, Central Java", "Borobudur is a magnificent ancient Buddhist temple located in central Java, Indonesia. Built during the 8th and 9th centuries by the Sailendra Dynasty, it is the largest Buddhist monument in the world and one of Indonesia’s most iconic landmarks. The temple is renowned for its impressive architecture, which consists of a massive pyramid-like structure with nine stacked platforms, including six square platforms and three circular ones, topped with a central dome.\n" +
                "\n" +
                "The temple is adorned with over 2,600 intricate relief panels and 504 statues of Buddha, showcasing stories from the Buddha's life and teachings. These reliefs are not only artistic masterpieces but also provide valuable insights into the religious and cultural beliefs of the time. Borobudur is also designed to represent a spiritual journey, with the lower levels symbolizing the world of desire, the middle levels representing the world of forms, and the upper levels signifying the world of formlessness and enlightenment.\n" +
                "\n" +
                "Borobudur is a UNESCO World Heritage site and an important pilgrimage destination for Buddhists, attracting visitors from around the world. Its stunning views of the surrounding landscape, including nearby volcanoes, add to the temple's allure. The temple underwent extensive restoration in the 20th century, ensuring its preservation for future generations. Borobudur stands not only as a symbol of Indonesia's cultural heritage but also as a testament to the engineering and artistic achievements of ancient civilizations."));
        tourismPlaces.add(new TourismPlace(R.drawable.image3, "Mount Bromo", "Probolinggo, East Java", "Mount Bromo is an active volcano located in East Java, Indonesia, and is one of the most iconic and visited natural landmarks in the country. Part of the Bromo Tengger Semeru National Park, Mount Bromo stands at 2,329 meters (7,641 feet) above sea level and is known for its breathtaking landscapes and dramatic volcanic activity.\n" +
                "\n" +
                "The volcano is situated within a vast caldera, known as the Tengger Sand Sea, a barren and surreal landscape of black volcanic sand. Mount Bromo's most famous feature is its constantly smoking crater, which emits sulfurous gases. Visitors often come to witness the spectacular sunrise over Bromo, where the volcano's silhouette is seen rising above the mist-filled caldera, creating a mesmerizing scene.\n" +
                "\n" +
                "The surrounding area is home to the Tenggerese people, an ethnic group that practices a unique blend of Hinduism and traditional customs. Every year, the Tenggerese celebrate the Yadnya Kasada, a religious festival in which offerings are thrown into the crater of Mount Bromo to appease the spirits of the mountain.\n" +
                "\n" +
                "Bromo is a popular destination for adventure tourists, trekkers, and photographers, with numerous hiking routes leading to the summit or offering panoramic views of the surrounding area. The volcano's active nature, combined with its dramatic setting, makes it one of Indonesia’s most visited and awe-inspiring destinations."));
        tourismPlaces.add(new TourismPlace(R.drawable.image4, "Komodo Island", "East Nusa Tenggara", "Komodo Island is part of the Komodo National Park, located in the Flores Sea between the islands of Sumbawa and Flores in Indonesia. It is famous for being the home of the world’s largest lizard, the Komodo dragon, which can grow up to 10 feet (3 meters) long and weigh over 150 kilograms (330 pounds). Komodo Island and its surrounding waters are a UNESCO World Heritage site, recognized for both their unique biodiversity and natural beauty.\n" +
                "\n" +
                "The island itself is rugged and dry, characterized by savannah landscapes, steep hills, and coastal areas. It is part of a larger group of islands within Komodo National Park, which also includes Rinca, Padar, and several smaller islands. The park is renowned for its stunning marine biodiversity, making it one of the top dive destinations in the world. The coral reefs and underwater ecosystems around Komodo are home to a vast array of marine species, including manta rays, sharks, sea turtles, and vibrant coral gardens.\n" +
                "\n" +
                "Komodo Island’s most famous residents, the Komodo dragons, are the main attraction for visitors. These giant reptiles are apex predators and can be found roaming freely across the island. Visitors can take guided tours to observe them in their natural habitat, but safety precautions are required due to the dragons' size and predatory nature.\n" +
                "\n" +
                "In addition to its wildlife, Komodo Island is also a popular destination for eco-tourism, trekking, and snorkeling. The island’s unique landscapes, dramatic cliffs, and crystal-clear waters create an unforgettable experience for those seeking adventure and natural beauty. Komodo Island is a symbol of Indonesia's rich natural heritage, and conservation efforts continue to protect both its terrestrial and marine ecosystems."));
        tourismPlaces.add(new TourismPlace(R.drawable.image5, "Lake Toba", "North Sumatra", "Lake Toba is a stunning volcanic lake located in North Sumatra, Indonesia. It is the largest volcanic lake in the world, measuring approximately 100 kilometers (62 miles) in length, 30 kilometers (19 miles) in width, and up to 505 meters (1,660 feet) deep. The lake was formed by a massive volcanic eruption around 74,000 years ago, which is one of the largest known eruptions in Earth's history. This catastrophic event created a caldera, which eventually filled with water, forming the lake we see today.\n" +
                "\n" +
                "At the center of Lake Toba lies Samosir Island, which is almost as large as Singapore and offers visitors a range of activities, including trekking, cycling, and exploring the local Batak culture. The Batak people are the indigenous ethnic group of the region, and their traditional villages, unique architecture, and distinctive culture make Lake Toba a culturally rich destination.\n" +
                "\n" +
                "The lake's serene and picturesque landscape, with its crystal-clear waters surrounded by lush green hills and towering mountains, is a popular draw for tourists seeking tranquility and natural beauty. Visitors can enjoy boat tours on the lake, which offer panoramic views of the surrounding area, as well as relax in lakeside resorts.\n" +
                "\n" +
                "In addition to its natural beauty, Lake Toba is known for its cultural significance, particularly in terms of the Batak people’s history and traditions. The region is also considered sacred, with many ancient sites and artifacts related to the Batak heritage scattered around the lake.\n" +
                "\n" +
                "Lake Toba is an important eco-tourism destination in Indonesia, attracting nature lovers, adventure seekers, and cultural enthusiasts from around the world. The area is also focused on sustainability efforts to preserve both its natural environment and cultural heritage."));
        tourismPlaces.add(new TourismPlace(R.drawable.image6, "Tanah Lot", "Tabanan, Bali", "Tanah Lot is one of Bali's most famous landmarks, known for its picturesque offshore setting and stunning sunset backdrops. Located on a rock formation just off the coast in Tabanan, Bali, this iconic sea temple attracts both local and international visitors who come to admire its beauty and spiritual significance.\n" +
                "\n" +
                "The temple is dedicated to sea gods in Balinese Hinduism and is believed to protect the island from evil sea spirits. During high tide, Tanah Lot appears to be floating on the ocean, adding to its mystical allure. Visitors can walk across a rocky path to the temple at low tide and witness traditional ceremonies performed by the Balinese priests.\n" +
                "\n" +
                "Tanah Lot offers a unique cultural experience, with numerous small shrines, traditional Balinese art shops, and scenic views surrounding the area. It is also popular among photographers for capturing Bali’s magical sunsets with the silhouette of the temple against the orange and pink hues of the sky.\n" +
                "\n" +
                "In addition to its cultural and spiritual appeal, Tanah Lot provides facilities for tourists, including dining options overlooking the temple, making it a wonderful place to relax and soak in Bali's enchanting atmosphere. A visit to Tanah Lot is a memorable experience that highlights Bali’s natural beauty and deep-rooted spiritual traditions."));
        tourismPlaces.add(new TourismPlace(R.drawable.image7, "Tanjung Puting National Park", "Central Kalimantan", "Tanjung Puting National Park is a famous conservation area in Central Kalimantan, Indonesia, known as one of the few places in the world where visitors can observe orangutans in the wild. This park covers a vast area of tropical rainforest and is home to diverse wildlife, including orangutans, proboscis monkeys, and various bird species.\n" +
                "\n" +
                "A popular activity is taking a boat cruise along the Sekonyer River, where tourists can spot orangutans at feeding stations or swinging from the trees. The park also has various eco-lodges for an immersive experience in nature.\n" +
                "\n" +
                "Tanjung Puting is not only a wildlife sanctuary but also plays a significant role in orangutan rehabilitation and forest preservation, attracting eco-tourists and conservationists from around the world."));
        tourismPlaces.add(new TourismPlace(R.drawable.image8, "Dieng Plateau", "Banjarnegara, Central Java", "The Dieng Plateau is a highland region located in Central Java, Indonesia, known for its mystical atmosphere, ancient temples, and geothermal landscapes. Sitting at an altitude of over 2,000 meters, the plateau offers a cool climate and breathtaking views of volcanic craters, hot springs, and colored lakes.\n" +
                "\n" +
                "Dieng is famous for its ancient Hindu temples, dating back to the 8th century, as well as its unique sulfur lakes, such as Telaga Warna, which changes colors depending on the angle of sunlight. The area is also known for its cultural heritage, including traditional Javanese dances and festivals.\n" +
                "\n" +
                "Dieng Plateau is a unique destination for those interested in natural wonders and ancient history, as well as photographers seeking to capture its otherworldly landscapes."));
        tourismPlaces.add(new TourismPlace(R.drawable.image9, "Labuan Bajo", "East Nusa Tenggara", "Labuan Bajo is a charming fishing town on the western tip of Flores Island, East Nusa Tenggara, and serves as the gateway to Komodo National Park. Known for its stunning seascapes, islands, and rich marine life, Labuan Bajo has become a popular destination for island hopping, snorkeling, and diving.\n" +
                "\n" +
                "In addition to the Komodo dragons, visitors can explore nearby islands such as Padar, with its iconic three-colored beaches, and Pink Beach, known for its rare pink sand. The area also offers scenic viewpoints, lush hills, and vibrant sunsets over the harbor.\n" +
                "\n" +
                "Labuan Bajo is an ideal base for adventurers and nature lovers who wish to explore Komodo National Park, as well as enjoy the tranquility of Flores."));
        tourismPlaces.add(new TourismPlace(R.drawable.image10, "Mount Rinjani", "Lombok, West Nusa Tenggara", "Mount Rinjani is an active volcano on the island of Lombok, Indonesia, and is the second-highest volcano in the country. This majestic mountain offers challenging trekking routes, rewarding climbers with panoramic views of the crater lake, Segara Anak, and the surrounding landscape.\n" +
                "\n" +
                "The trek up Mount Rinjani is known for its steep trails and stunning scenery, which includes waterfalls, lush forests, and volcanic rock formations. At the summit, hikers can witness a sunrise view that reveals the crater lake and smaller volcanic cones within.\n" +
                "\n" +
                "Mount Rinjani is a popular destination for trekkers seeking adventure and natural beauty, with options for multi-day trekking expeditions led by local guides."));
        tourismPlaces.add(new TourismPlace(R.drawable.image11, "Belitung Island", "Bangka Belitung", "Belitung Island, located off the eastern coast of Sumatra, is famous for its stunning granite rock formations, white sandy beaches, and crystal-clear waters. Known as the filming location for the Indonesian movie 'Laskar Pelangi,' Belitung has since become a popular destination.\n" +
                "\n" +
                "Visitors can explore beaches like Tanjung Tinggi, which features unique granite boulders and calm waters perfect for swimming and snorkeling. Nearby small islands, such as Lengkuas Island with its iconic lighthouse, are also accessible by boat and offer scenic views and underwater beauty.\n" +
                "\n" +
                "Belitung Island is ideal for beach lovers, photographers, and those looking to enjoy tranquil, pristine beachscapes away from the crowds."));
        tourismPlaces.add(new TourismPlace(R.drawable.image12, "Jatim Park 1", "Batu, East Java", "Jatim Park 1 is a popular theme park in Batu, East Java, known for its exciting rides, educational exhibits, and cultural displays. Established as one of the first attractions in the Jatim Park series, Jatim Park 1 combines amusement rides with cultural and scientific learning, making it an ideal destination for both fun and education.\n" +
                "\n" +
                "The park features a variety of thrilling rides, such as roller coasters, water slides, and Ferris wheels, as well as family-friendly attractions like bumper cars and carousels. Jatim Park 1 also includes the Science Center, which offers interactive exhibits on physics, biology, and mathematics to inspire curiosity among visitors.\n" +
                "\n" +
                "In addition to its amusement rides, Jatim Park 1 highlights Indonesia’s rich cultural diversity through its unique Nusantara Gallery, where visitors can learn about traditional Indonesian cultures, costumes, and architecture from different regions.\n" +
                "\n" +
                "With its mix of attractions, Jatim Park 1 is perfect for families and travelers looking for a lively and educational experience in East Java. It remains one of the top destinations in Batu for both entertainment and cultural exploration."));
        tourismPlaces.add(new TourismPlace(R.drawable.image13, "Jatim Park 2", "Batu, East Java", "Jatim Park 2, also known as Batu Secret Zoo and Museum Satwa, is a popular family-friendly destination in Batu, East Java, Indonesia. The park combines a modern zoo and a world-class wildlife museum, offering visitors an immersive experience with diverse animal exhibits and educational displays.\n" +
                "\n" +
                "Batu Secret Zoo features animals from around the world, including big cats, primates, birds, and reptiles. The zoo's enclosures are designed to be interactive, allowing visitors to get up close to the animals in a safe and respectful environment. Museum Satwa, located adjacent to the zoo, showcases lifelike dioramas and preserved specimens of animals from various habitats, aiming to educate visitors on biodiversity and conservation.\n" +
                "\n" +
                "Jatim Park 2 is ideal for families and animal enthusiasts seeking both fun and educational experiences. With engaging attractions, such as animal feeding and interactive exhibits, Jatim Park 2 offers a complete day of adventure and learning."));
        tourismPlaces.add(new TourismPlace(R.drawable.image14, "Jatim Park 3", "Batu, East Java", "Jatim Park 3, also known as Dino Park, is a unique theme park located in Batu, East Java, Indonesia, offering an exciting journey through the age of the dinosaurs and beyond. The park features a variety of attractions, including life-sized dinosaur replicas, interactive exhibits, and augmented reality experiences, making it a hit among children and families.\n" +
                "\n" +
                "The main attraction, Dino Park, takes visitors on a prehistoric adventure with animatronic dinosaurs and educational displays that showcase the Mesozoic era. Other sections in Jatim Park 3 include The Legend Star, which features wax figures of famous historical and modern personalities, and Fun Tech Plaza, where visitors can enjoy futuristic games and virtual reality experiences.\n" +
                "\n" +
                "Jatim Park 3 is perfect for families looking for a fun and educational outing. Its unique combination of historical, scientific, and entertainment-based attractions makes it a must-visit destination in East Java for both locals and tourists alike."));
        tourismPlaces.add(new TourismPlace(R.drawable.image15, "Museum Angkut", "Batu, East Java", "Museum Angkut is a unique transportation-themed museum located in Batu, East Java, Indonesia. It is the first and largest transportation museum in Southeast Asia, featuring an extensive collection of vehicles from different eras and countries. The museum offers a fun, educational experience as visitors can explore various modes of transport, from vintage cars and motorcycles to aircraft and bicycles.\n" +
                "\n" +
                "Museum Angkut is divided into several themed zones, including the Batavia zone, Hollywood zone, European zone, and Gangster & Broadway zone. Each zone is designed to resemble iconic locations, complete with lifelike street scenes and backdrops, allowing visitors to take photos with famous vehicles in realistic settings.\n" +
                "\n" +
                "Highlights include classic American cars, Italian Vespa scooters, and a replica of Indonesia’s presidential car. The museum also offers an interactive experience in the Flight Simulator and has a section dedicated to Indonesian transportation history, where visitors can learn about the evolution of transport in the country.\n" +
                "\n" +
                "In addition to its exhibitions, Museum Angkut regularly hosts cultural performances and parades. It’s an ideal destination for families, history buffs, and anyone interested in vintage vehicles and transportation history, providing a blend of education and entertainment in a unique setting."));


        adapter = new TourismAdapter(filteredPlaces, this);
        recyclerView.setAdapter(adapter);

        SearchView searchView = findViewById(R.id.search_view);
        searchView.setOnQueryTextListener(new SearchView.OnQueryTextListener() {
            @Override
            public boolean onQueryTextSubmit(String query) {
                filterPlaces(query);
                return true;
            }

            @Override
            public boolean onQueryTextChange(String newText) {
                filterPlaces(newText);
                return true;
            }
        });
    }

    private void filterPlaces(String query) {
        filteredPlaces.clear();
        for (TourismPlace place : tourismPlaces) {
            if (place.getName().toLowerCase().contains(query.toLowerCase())) {
                filteredPlaces.add(place);
            }
        }
        adapter.notifyDataSetChanged();
    }
}
