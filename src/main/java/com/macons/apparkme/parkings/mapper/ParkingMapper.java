package com.macons.apparkme.parkings.mapper;

import com.macons.apparkme.parkings.api.model.ParkingResponse;
import com.macons.apparkme.parkings.dto.ParkingDTO;
import com.macons.apparkme.parkings.entities.Parking;
import org.mapstruct.Mapper;
import org.mapstruct.factory.Mappers;

@Mapper(componentModel = "spring")
public interface ParkingMapper {

    ParkingMapper INSTANCE = Mappers.getMapper(ParkingMapper.class);

    Parking parkingDTOToParking(ParkingDTO parkingDTO);

    ParkingDTO parkingResponseToParkingDTO(ParkingResponse parkingResponse);

    ParkingResponse parkingDTOToParkingResponse(ParkingDTO parkingDTO);

    ParkingDTO parkingToParkingDTO(Parking parking);

}
