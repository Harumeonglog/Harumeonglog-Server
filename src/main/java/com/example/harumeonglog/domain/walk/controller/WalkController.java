package com.example.harumeonglog.domain.walk.controller;

import com.example.harumeonglog.domain.common.controller.response.CustomResponse;
import com.example.harumeonglog.domain.walk.controller.dto.request.WalkRequest;
import com.example.harumeonglog.domain.walk.controller.dto.response.WalkResponse;
import com.example.harumeonglog.domain.walk.controller.port.WalkService;
import com.example.harumeonglog.domain.walk.domain.Walk;
import lombok.RequiredArgsConstructor;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/walks")
@RequiredArgsConstructor
public class WalkController {

    private final WalkService walkService;

    @PostMapping
    public ResponseEntity<CustomResponse<WalkResponse.WalkCreateResponse>> createWalk(@RequestBody WalkRequest.WalkCreateRequest walkCreateRequest) {
        Walk walk = walkService.createWalk(walkCreateRequest);
        return ResponseEntity.status(HttpStatus.CREATED).body(CustomResponse.created(WalkResponse.WalkCreateResponse.from(walk)));
    }

    @GetMapping
    public CustomResponse<WalkResponse.WalkSearchListResponse> getWalkList(@RequestParam(value = "sort", defaultValue = "RECOMMEND") String sort,
                                                                       @RequestParam(value = "cursor", required = false) Long cursor,
                                                                       @RequestParam(value = "offset", defaultValue = "10") int offset) {
        WalkResponse.WalkSearchListResponse response = walkService.getWalkList(sort, cursor, offset);
        return CustomResponse.ok(response);
    }

    @GetMapping("/{walkId}")
    public CustomResponse<WalkResponse.WalkDetailResponse> getWalk(@PathVariable Long walkId) {
        WalkResponse.WalkDetailResponse response = walkService.getWalkDetails(walkId);
        return CustomResponse.ok(response);
    }

    @PatchMapping("/{walkId}")
    public CustomResponse<WalkResponse.ShareWalkResponse> shareWalk(@PathVariable Long walkId) {
        Walk walk = walkService.shareWalk(walkId);
        return CustomResponse.ok(WalkResponse.ShareWalkResponse.from(walk));
    }
}
