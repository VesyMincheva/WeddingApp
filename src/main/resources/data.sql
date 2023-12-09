-- users
INSERT INTO users (id, first_name, last_name, username, email, password)
VALUES (1, 'Admin', 'Adminov', 'admin', 'admin@admin.com', '52c99076fd47aa98d0d51549d5d3b3cbe9a87d069a4117d1be5f26ebdf9abcecd94095348344ea3b8c31a500d6de9f34');

INSERT INTO users (id, first_name, last_name, username, email,  password)
VALUES (2, 'User', 'Userov', 'user2', 'user@user.com', '26dd1ba9ae974a70136ea4463046371516661b0601ca0fb83a905876ca549b3473dd524d578e241b');

INSERT INTO users (id, first_name, last_name, username, email, password)
VALUES (3, 'Ivan', 'Ivanov', 'ivanov','ivan@ivan.com', '26dd1ba9ae974a70136ea4463046371516661b0601ca0fb83a905876ca549b3473dd524d578e241b');

INSERT INTO users (id, first_name, last_name, username, email, password)
VALUES (4, 'Ivelina', 'Stoyanova', 'ivelina','iveto@mail.com', '26dd1ba9ae974a70136ea4463046371516661b0601ca0fb83a905876ca549b3473dd524d578e241b');

INSERT INTO users (id, first_name, last_name, username, email, password)
VALUES (5, 'Malina', 'Georgieva', 'mailna','malinka@mail.com', '26dd1ba9ae974a70136ea4463046371516661b0601ca0fb83a905876ca549b3473dd524d578e241b');

INSERT INTO users (id, first_name, last_name, username, email, password)
VALUES (6, 'Martin', 'Janov', 'martin','martin@mail.com', '26dd1ba9ae974a70136ea4463046371516661b0601ca0fb83a905876ca549b3473dd524d578e241b');

INSERT INTO users (id, first_name, last_name, username, email, password)
VALUES (7, 'Asya', 'Aleksandrova', 'aseto','asya@mail.com', '26dd1ba9ae974a70136ea4463046371516661b0601ca0fb83a905876ca549b3473dd524d578e241b');

INSERT INTO users (id, first_name, last_name, username, email, password)
VALUES (8, 'Gabriela', 'Zaharieva', 'gabbi','gabby@mail.com', '26dd1ba9ae974a70136ea4463046371516661b0601ca0fb83a905876ca549b3473dd524d578e241b');

INSERT INTO users (id, first_name, last_name, username, email, password)
VALUES (9, 'Petko', 'Liliev', 'petko','petko@mail.com', '26dd1ba9ae974a70136ea4463046371516661b0601ca0fb83a905876ca549b3473dd524d578e241b');

INSERT INTO users (id, first_name, last_name, username, email, password)
VALUES (10, 'Eva', 'Hristova', 'eva','eva@mail.com', '26dd1ba9ae974a70136ea4463046371516661b0601ca0fb83a905876ca549b3473dd524d578e241b');

INSERT INTO users (id, first_name, last_name, username, email, password)
VALUES (11, 'Stela', 'Lazarova', 'stela','stela@mail.com', '26dd1ba9ae974a70136ea4463046371516661b0601ca0fb83a905876ca549b3473dd524d578e241b');

INSERT INTO users (id, first_name, last_name, username, email, password)
VALUES (12, 'Iva', 'Kirilova', 'iveto','ivetokirilova@mail.com', '26dd1ba9ae974a70136ea4463046371516661b0601ca0fb83a905876ca549b3473dd524d578e241b');

INSERT INTO users (id, first_name, last_name, username, email, password)
VALUES (13, 'Petq', 'Radova', 'petq','petq@mail.com', '26dd1ba9ae974a70136ea4463046371516661b0601ca0fb83a905876ca549b3473dd524d578e241b');

INSERT INTO users (id, first_name, last_name, username, email, password)
VALUES (14, 'Irka', 'Borisova', 'irka','irka@mail.com', '26dd1ba9ae974a70136ea4463046371516661b0601ca0fb83a905876ca549b3473dd524d578e241b');

-- user roles
INSERT INTO roles (id, role)
VALUES (1, 'ADMIN');

INSERT INTO roles (id, role)
VALUES (2, 'USER');

-- locations
INSERT INTO locations (id, name)
VALUES (1, 'INDOOR');

INSERT INTO locations (id, name)
VALUES (2, 'GARDEN');

INSERT INTO locations (id, name)
VALUES (3, 'BEACH');

-- locations
INSERT INTO wedding_styles (id, name)
VALUES (1, 'TRADITIONAL');

INSERT INTO wedding_styles (id, name)
VALUES (2, 'MODERN');

INSERT INTO wedding_styles (id, name)
VALUES (3, 'VINTAGE');

INSERT INTO wedding_styles (id, name)
VALUES (4, 'RUSTIC');

-- admin
INSERT INTO users_roles (`user_id`, `role_id`)
VALUES (1, 1);
INSERT INTO users_roles (`user_id`, `role_id`)
VALUES (1, 2);

-- users
INSERT INTO users_roles (`user_id`, `role_id`)
VALUES (2, 2);

INSERT INTO users_roles (`user_id`, `role_id`)
VALUES (3, 2);

INSERT INTO users_roles (`user_id`, `role_id`)
VALUES (4, 2);

INSERT INTO users_roles (`user_id`, `role_id`)
VALUES (5, 2);

INSERT INTO users_roles (`user_id`, `role_id`)
VALUES (6, 2);

INSERT INTO users_roles (`user_id`, `role_id`)
VALUES (7, 2);

INSERT INTO users_roles (`user_id`, `role_id`)
VALUES (8, 2);

INSERT INTO users_roles (`user_id`, `role_id`)
VALUES (9, 2);

INSERT INTO users_roles (`user_id`, `role_id`)
VALUES (10, 2);

INSERT INTO users_roles (`user_id`, `role_id`)
VALUES (11, 2);

INSERT INTO users_roles (`user_id`, `role_id`)
VALUES (12, 2);

INSERT INTO users_roles (`user_id`, `role_id`)
VALUES (13, 2);

INSERT INTO users_roles (`user_id`, `role_id`)
VALUES (14, 2);

-- stories
INSERT INTO wedding_stories (id, title, content, author_id, location_id, style_id)
VALUES
    (1, "Ivelina & Stoyan romantic beach wedding", "Ivelina met her bridesmaids at 9 am on the morning of the wedding to have their hair and makeup done. A festive mimosa bar, brunch spread, and specialty coffee drinks from Coastal Coffee Bar were prepared for all the girls and any close family members who wanted to drop by. Meanwhile, Stoyan and the groomsmen enjoyed lunch at the Homeowner’s pavilion before meeting the wedding party for pictures at The Pearl Hotel. Following a fun photo session, it was time for the ceremony at the Town Hall. Ivelina walked in on her father’s arm and was overwhelmed by the setting, the brilliant florals, and the specialty lighting. Following the nuptials, a bagpiper led guests from the Veuve Clicquot champagne bar in the courtyard of the Town Hall to cocktail hour on the Western Green lawn, where they took more photos, and the newlyweds shared their first dance to “Shining Star” by the Manhattans. The reception included an elaborate seated dinner, heartfelt toasts, cake, and dancing to Rhythm Nation. The festivities continued with an after-party featuring a cigar bar, slider and french fry bar, and Hero’s donuts.", 4, 3, 2);

INSERT INTO wedding_stories (id, title, content, author_id, location_id, style_id)
VALUES
    (2, "This is What Dreams Are Made Of", "The wedding and ceremony took place at the historic Castello di Celsa in Siena, Italy, dating back to the 13th century. The location was lush, with greenery from the gardens all the way up the vines of the castle, romantic architecture, and spectacular views of the Italian countryside. The weather called for rain, and the morning started foggy until just one hour before Georgi and Malina’s first look… The sun came out, the clouds cleared, and it provided the most magical setting for their first moments together as bride and groom. For the ceremony, Malina wore a custom Justin Alexander gown. The gown, customized with personal embroidery and handwritten by Georgi, had a magnificent dramatic veil to match. The guests entered the garden underneath gorgeous floral archways and were greeted by a string quartet. Following the ceremony, the extraordinary chefs at Guidi Lenci Catering prepared an authentic Tuscan menu. The reception space was decorated with twinkling lights, more flowers, and beautiful Italian dinnerware. There was a gelato cart, and Malina and Georgi helped create their wedding cake on the spot by hand, making it together in front of their guests. After dessert, the couple invited their guests to join them outside for a spectacular fireworks display in the gardens before they shared their first dance.", 5, 2, 3);

INSERT INTO wedding_stories (id, title, content, author_id, location_id, style_id)
VALUES
    (3, "Floral Beauty", "On Saturday, October 8th, 2022, Jana and Martin were married at the Wedding House in Terra, Sofia. Surrounded by their closest friends and family, Jana and Martin were showered with endless love. They were able to celebrate their most perfect day with their three-year-old daughter, Lili, as their flower girl. Jana walked down the ethereal white and blue flower-covered aisle to say “I do” to the man she’s prayed for her whole life. After the ceremony, the guests enjoyed delicious food and the stunning three-tier honeybun cake by Social Bites Connection. Guests danced the night away on Jana and Martin’s dance floor decorated with their family crest. At 10 p.m., cheeseburgers from David’s Burgers, a local Sofia restaurant, were served. A cotton candy truck was available with custom flavors, making for endless amounts of dessert fun. After the reception, the newlyweds rode away in a gorgeous cream-colored vintage car—a wonderful way to end their best day.", 6, 1, 1);

INSERT INTO wedding_stories (id, title, content, author_id, location_id, style_id)
VALUES
    (4, "Our beautifull wedding", "Asya and Alex were overjoyed with the love they felt on their big day. The wedding day started with hair and make-up for the bride and bridesmaids. Asya had a blast spending the day with her closest friends and family, laughing and reminiscing about the previous night’s event and the other wedding festivities. While the ladies were getting ready, the groom and groomsmen gathered in the Ritz Carlton suite. The bride and groom met in City Park for a romantic first look, followed by family and wedding party pictures, and before they knew it, Asya was walking down the aisle to say ‘I do’ in the most beautiful and historic Church. After the couple exchanged vows and exited the church, a brass band led the newlyweds, bridal party, and family members in a ‘second line’. The reception began with a cocktail hour and electric violinists, followed by an incredible reception featuring an ice bar, sushi, fantastic food and cocktails, and dancing all through the night! The ‘gold man’ and ‘silver man’, famous in Plovdiv, made a special appearance along with the Mardi Gras Indians, who led yet another ‘second line at the end of the reception. After the reception ended, the After Party began with a fabulous DJ and late-night bites for all.", 7, 1, 2);

INSERT INTO wedding_stories (id, title, content, author_id, location_id, style_id)
VALUES
    (5, "Beauty in the Mountains", "On Saturday, September 3rd, 2022, Gabby Apperson married Zahari Dimitroc at Tuscan Ridge in Velingrad, Bulgaria, surrounded by beloved friends and family members. The venue bloomed to life when guests arrived at Tuscan Ridge and delighted in the lush flowers and decor as the bride, groom, and their respective parties prepared for the ceremony. Their two German Shepherds, donned in matching maroon outfits, were delighted to be a part of the festivities. After the service, Gabby, Zahari, and the bridal party released butterflies in remembrance of Gabby’s late Grandmother. While the butterflies flew away, Gabby and Zahari took pictures and kissed in the golden hour. The DJ announced the newlywed couple, and Gabby and Zach danced throughout the night. The wedding guests enjoyed a fabulous evening of dancing, heartfelt toasts, photo booth pictures, and catered Chipotle—the perfect way to celebrate the union of Gabby and Zach Dimitrovi.", 8, 2, 4);

INSERT INTO wedding_stories (id, title, content, author_id, location_id, style_id)
VALUES
    (6, "Dream Come True", "The wedding weekend kicked off with poolside drinks at The Confidante Golden Sands, where the soon-to-be Mr. and Mrs. were able to mingle with their guests, including those that had traveled from out of town. The morning of, Lili and her “man of honor” took a walk on the beach to calm her jitters and appreciate the beautiful oceanfront setting. She and Petko got ready separately with their closest friends and family. Lili’s mom helped her fashion her wedding dress which included snapping the buttons on her gown (which were from her mom’s wedding) and acted as the bride’s “something old”. For “something borrowed”, Lili wrapped her bouquet with Petko’s late grandmother’s crystal rosary. Before seeing her groom, she did a first look with her dad and brother, which Lili felt was one of the most emotional parts of the day. She and Petko also chose to do a first look which was amazing and allowed them to enjoy some time alone together before the rest of the day unfolded.", 9, 3, 1);

INSERT INTO wedding_stories (id, title, content, author_id, location_id, style_id)
VALUES
    (7, "Eva & Hristo Peaky Blinders Wedding", "The day went by so quickly! The week before, rain was in the forecast and I was so stressed because out ceremony was outdoors. It sprinkled a little in the morning but cleared up to be the most gorgeous afternoon. Exchanging vows and saying “I do” was definitely my favorite part of the day. A string quartet played “Stand by Me”, “Dog Days Are Over”, “Your Song”, “What a Wonderful World”, and Nate and I exited to “Paradise” by Coldplay. We wrote our own vows, and everyone told us the sun was shining down and little pine needles were falling from the trees above us onto the pond that was behind us. It was gorgeous. Our reception was so much fun and the best part was no longer being worried about the day. We enjoyed our family and friends and drank a lot of really great Maine beer that we brought with us and craft cocktails made with liquor from Nate’s uncle’s distillery.", 10, 2, 4);

INSERT INTO wedding_stories (id, title, content, author_id, location_id, style_id)
VALUES
    (8, "Always Be My Baby", "Stela and Lazar’s ceremony was held at the historic Marigny Opera House. It commenced just as twilight’s glow began to fall upon the tall stained-glass windows behind the couple’s altar, bathing the room in warmth. The groom, eager to kiss his bride, elected to do so before being given the cue by the officiant. Sometimes love cannot wait. Instead of a “first look” before the ceremony, Stela and Lazar chose to share a “first moment” alone together, taking time to catch their breath before being whisked away to their reception. The front gates of Southern Oaks opened to “Hey Baby”, played not by Bruce Channel, but by a twenty-piece marching band in true New Orleans style. As the band serenaded the crowd, dazzling fireworks display lit up the night sky and streamers gracefully fell to complete the couple’s grand entrance. The night was filled with music and dancing, including a show-stopping impromptu performance by the father of the bride, singing “Make Me Smile” by Chicago with a live band.", 11, 1, 1);

INSERT INTO wedding_stories (id, title, content, author_id, location_id, style_id)
VALUES
    (9, "Farmhouse Elegance", "We got engaged on May 25th, 2018 and the planning started immediately once we got home for the big day on March 23rd, 2019. I tell everyone this, but I thought wedding planning was so much fun. I had a blast planning, searching for vendors, etc. Kiril and I tied the knot at Harvest Hollow Venue and Farm in Simeonovets, Pazarik . We could not have pictured a more perfect day. Literally. All of our friends and family gathered together to celebrate us and it was by far the best day of our lives. The weather was perfect, we had the best wedding party, and our vendors were all phenomenal. There is not one single thing I would change about our big day. ", 12, 1, 2);

INSERT INTO wedding_stories (id, title, content, author_id, location_id, style_id)
VALUES
    (10, "Stand By Me", "The couple felt beyond loved on the “most magical day of their lives.” The big day began early with hair and makeup for the bride and bridesmaids. Petq had so much fun spending time with her girl squad leading up to the walk down the aisle. Just past the 2 o’clock hour, Petq and her squad took photos and primped Petq for the “first look” with Rado. Their videographer was able to capture this special moment beautifully, and included it in their wedding video. In a vintage military ceremony, the pair said “I do” under a beautiful arbor and lush trees, honoring the groom’s career and service. Petq and Rado were so proud to confess their love before friends and family from near and far. Following the ceremony, a lively reception ensued with a grand cake cutting, champagne flowing, and an evening of dancing.", 13, 1, 3);

INSERT INTO wedding_stories (id, title, content, author_id, location_id, style_id)
VALUES
    (11, "Elegant Romance", "The wedding day weather was a perfect 82 degrees and sunny. Irka and Boris went to the courthouse and married in front of close friends and family. The newlyweds drove off in a 1955 Chevrolet Belair C2 to the Denton Country Club for an elaborate party, where over 300 guests anticipated their arrival while sipping on champagne. The celebration soon escalated, and guests hit the dance floor, moving to the sounds of all the classics played by DJ Michael Blake. An explosion of flowers and balloons filled the club from floor to ceiling. Family and friends dined on an elevated Southern menu of sliders, a baked potato bar, a Mac n’ cheese bar, a salad bar, a charcuterie station, and a dessert filled with various cobblers. The couple danced the night away and held a send-off brunch the following morning.", 14, 1, 1);

-- comments
INSERT INTO comments (`id`, `text_content`, `created`, `created_by_id`, `story_id`)
VALUES
    (1, 'Very romantic!', '2022-11-14 08:10:40', 4, 4),
    (2, 'What a beautiful wedding!', '2022-01-12 09:03:47', 10, 4),
    (3, 'Super cool', '2023-02-14 01:11:40', 9, 4),
    (4, 'Fantastic!', '2022-05-03 08:20:41', 2, 4),
    (5, 'Nice place!', '2023-10-14 02:10:42', 4, 3),
    (6, 'You are great couple!', '2022-10-17 08:10:20', 10, 2),
    (7, 'I wish you all the best!', '2022-09-14 08:10:40', 9, 1),
    (8, 'Big moment for all family!', '2022-10-17 07:10:23', 4, 10),
    (9, 'So elegant!', '2022-06-23 07:10:47', 11, 9),
    (10, 'When you realize you want to spend the rest of your life with somebody, you want the rest of your life to start as soon as possible.', '2022-10-29 10:10:40', 7, 7),
    (11, 'It was so much fun!', '2022-05-22 07:10:34', 12, 8),
    (12, 'Cheers!', '2023-01-13 05:02:40', 11, 8),
    (13, 'Amazing party!', '2022-12-12 02:10:34', 14, 5),
    (14, 'Love this story!', '2022-12-24 07:10:40', 4, 6),
    (15, 'So cool!', '2023-01-01 09:10:40', 14, 5);

-- pictures
INSERT INTO pictures(id, title, url, author_id, story_id)
VALUES (1, 'IvetoStoyan', '/images/pictures/id1beach_modern.jpg', 4, 1),
       (2, 'MalinaGeorgi1', '/images/pictures/id2garden_vintage.jpg', 5, 2),
       (3, 'MalinaGeorgi2', '/images/pictures/id2garden_vintage2.jpg', 5, 2),
       (4, 'MartinJana', '/images/pictures/id3indoor_traditional.jpg', 6, 3),
       (5, 'AsqAleks', '/images/pictures/id4indoor_modern.jpg', 7, 4),
       (6, 'GabiZahari', '/images/pictures/id5garden_rustic.jpg', 8, 5),
       (7, 'PetkoLili', '/images/pictures/id6beach_traditional.jpg', 9, 6),
       (8, 'EvaHristo', '/images/pictures/id7garden_rustic.jpg', 10, 7),
       (9, 'StelaLazar', '/images/pictures/id8indoor_traditional.jpg', 11, 8),
       (10, 'IvetoKiro', '/images/pictures/id9indoor_modern.jpg', 12, 9),
       (11, 'PetqRado', '/images/pictures/id10indoor_vintage.jpg', 13, 10),
       (12, 'IrkaBoris', '/images/pictures/id11indoor_traditional.jpg', 14, 11),
       (13, 'IrkaBoris2', '/images/pictures/id11indoor_traditional2.jpg', 14, 11);
