INSERT INTO `Card_Product`
(id, card_id, card_group_id, p1_set_building, p2_set_building, p1_set_resource, p2_set_resource,
 p1_set_upgrade, p2_set_upgrade, necessary_building_set, necessary_upgrade_set)
VALUES

  /*BUILDING CARDS*/
  (1,1,1,1,null,1,null,null,null,null,null),
  (2,2,1,2,null,2,null,null,null,null,null),
  (3,3,1,3,null,3,null,null,null,null,null),
  (4,4,1,4,null,4,null,null,null,101,null),
  (5,5,1,5,null,5,null,null,null,101,null),
  (6,6,1,6,null,6,null,null,null,101,null),
  (7,7,1,7,null,7,null,null,null,102,null),
  (8,8,1,8,null,8,null,null,null,103,null),
  (9,9,1,9,null,9,null,null,null,104,null),
  (10,10,1,10,null,10,null,null,null,104,null),
  (11,11,1,11,null,11,null,null,null,102,null),
  (12,12,1,12,null,12,null,null,null,106,null),
  (13,13,1,13,null,13,null,null,null,106,null),
  (14,14,1,14,null,14,null,null,null,102,null),
  (15,15,1,15,null,15,null,null,null,107,null),
  (16,16,1,16,null,16,null,null,null,107,null),
  (17,17,1,17,null,17,null,null,null,102,null),
  (18,18,1,18,null,18,null,null,null,108,null),
  (19,19,1,19,null,19,null,null,null,108,null),
  (20,20,1,20,null,20,null,null,null,105,null),
  (21,21,1,21,null,21,null,null,null,109,null),
  (22,22,1,22,null,22,null,null,null,109,null),
  /*UPGRADE CARDS*/
  (23,23,2,23,null,23,null,1,null,110,null),
  (24,24,2,24,null,24,null,2,null,111,101),
  (25,25,2,25,null,25,null,3,null,112,null),
  (26,26,2,26,null,26,null,4,null,113,null),
  (27,27,2,27,null,27,null,5,null,114,null),
  (28,28,2,28,null,28,null,6,null,115,null),
  (29,29,2,29,null,29,null,7,null,116,null),
  (30,30,2,30,null,30,null,8,null,117,null),
  (31,31,2,31,null,31,null,9,null,118,null),
  (32,32,2,32,null,32,null,10,null,119,null),
  (33,33,2,33,null,33,null,11,null,120,null),
  (34,34,2,34,null,34,null,12,null,121,null),
  (35,35,2,35,null,35,null,13,null,122,null),
  (36,36,2,36,null,36,null,14,null,123,null),
  (37,37,2,37,null,37,null,15,null,124,null),
  (38,38,2,38,null,38,null,16,null,125,null),
  (39,39,2,39,null,39,null,17,null,126,null),
  (40,40,2,40,null,40,null,18,null,127,null),
  (41,41,2,41,null,41,null,19,null,128,null),
  (42,42,2,42,null,42,null,20,null,129,null),
  (43,43,2,43,null,43,null,21,null,130,null),
  (44,44,2,44,null,44,null,22,null,131,null),
  (45,45,2,45,null,45,null,23,null,132,null),
  (46,46,2,46,null,46,null,24,null,133,null),
  (47,47,2,47,null,47,null,25,null,134,null),
  (48,48,2,48,null,48,null,26,null,135,null),
  (49,49,2,49,null,49,null,27,null,136,null),
  (50,50,2,50,null,50,null,28,null,137,null),
  (51,51,2,51,null,51,null,29,null,138,null),
  (52,52,2,52,null,52,null,30,null,139,null),
  /*ACTION CARDS */
  (53,53,3,null,null,53,54,null,null,107,null),
  (54,54,3,null,null,55,56,null,null,141,102),
  (55,55,3,null,null,57,58,null,null,140,null),
  (56,56,3,null,null,59,60,null,null,142,103),
  (57,57,3,null,null,61,62,null,null,143,null),
  (58,58,3,null,null,63,64,null,null,144,null),
  (59,59,3,null,null,65,66,null,null,145,null),
  (60,60,3,null,53,67,null,null,null,146,104),
  (61,61,3,null,54,68,69,null,null,147,105);
